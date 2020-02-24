# HEROES WITHOUT HOPE

Il progetto consiste in un tool per la gestione delle gesta per il
gioco di ruolo Project H.O.P.E.

```

public static void main(String[] args) {
    HeroicFeat heroicFeat = new HeroicFeat();

    String name = input();
    String description = input();
    heroicFeat.setName(name);
    heroicFeat.setDescription(description);

    List<IFeatAttribute> featAttributes = new ArrayList<IFeatAttribute>();
    
    // I passi vanno eseguiti in quest'ordine preciso!
    featAttributes.add(01_GetBodyLocation());
    featAttributes.add(02_GetDuration());
    featAttributes.add(03_GetTargets());

    IFeatAttribute bonusFeat = 04_GetBonus();
    if(bonusFeat != null) {
        featAttributes.add(bonusFeat);
    }

    IFeatAttribute movementFeat = 05_GetMovement();
    if(movementFeat != null) {
        featAttributes.add(movementFeat);
    }

    // Doppione
    IFeatAttribute movementFeat = 05_GetMovement();
    if(movementFeat != null) {
        featAttributes.add(movementFeat);
    }

    IFeatAttribute combatFeat = 06_GetCombat();
    if(combatFeat != null) {
        featAttributes.add(combatFeat);
    }

    IFeatAttribute editorFeat = 07_GetEditor();
    if (editorFeat != null) {
        featAttributes.add(editorFeat);
    }
    heroicFeat.setAttributes(featAttributes);
}

private IFeatAttribute 01_GetBodyLocation() {
    BodyLocationModel model = new BodyLocationModel();
    List<BodyLocationENUM> locations = input();
    model.setBodyLocation(locations);
    return new BodyLocationFeat(model);
}

private IFeatAttribute 02_GetDuration() {
    DurationFeatModel model = new DurationFeatModel();
    DurationENUM duration = input();
    model.setDuration(duration);
    return new DurationFeat(model);
}

private IFeatAttribute 03_GetTargets() {
    bool usaArea = input();
    TargetFeatModel model = new TargetFeatModel();
    if(usaArea) {
        AreaModel areaModel = new AreaModel();
        AreaTypeENUM areaType = input();
        areaModel.setAreaType(areaType);
        if(areaType == AreaTypeENUM.DEFINED) {
            int multiplier = input();
            int excludedTargets = input();
            areaModel.setAreaMultiplier(multiplier);
            areaModel.setExcludedTarget(excludedTarget);
        }
        model.setArea(areaModel);
    }
    DistanceModel distanceModel = new DistanceModel();
    DistanceTypeENUM distanceType = input();
    distanceModel.setDistanceType(distanceType);
    if (distanceType == DistanceTypeENUM.DEFINED) {
        int meters = input();
        int multiplier = input();
        distanceModel.setValue(meters);
        distanceModel.setMultiplier(multiplier);
    }
    int numberOfTarget = input();
    distanceModel.setNumberOfTarget(numberOfTarget);
    model.setDistance(distanceModel);
    return new TargetFeat(model);
}

/*
La magnitudo e' la somma dei due bonus: CharacterAbilityBonus e
CharacterFeatBonus.
   Per ogni abilita' in CharacterAbilityBonus la magnitudo e' il suo valore
   Per ogni caratteristica in CharacterFeatBonus la magnitudo e' il suo valore * 3.
 */
private IFeatAttribute 04_GetBonus() {
    bool isBonus = input();
    if(isBonus) {
        BonusFeatModel bonusFeatModel = new BonusFeatModel();
        List<CharacterFeatBonus> characterFeats = new ArrayList<CharacterFeatBonus>();
        // L'utente deve selezionare quali caratteristiche riceveranno il bonus
        while(input()) {
            CharacterFeatBonus characterFeatBonus = new CharacterFeatBonus ();
            CharacterFeatENUM characterFeat = input();
            int value = input();
            characterFeatBonus.setCharacterFeat(characterFeat);
            characterFeatBonus.setValue(value);
            characterFeats.add(characterFeatBonus)
        }
        bonusFeatModel.setCharacterFeats(characterFeats);

        List<CharacterAbilityBonus> characterAbilities = new ArrayList<CharacterAbilityBonus>();
        // L'utente deve selezionare quali abilita' riceveranno il bonus
        while(input()) {
            CharacterAbilityBonus characterAbilityBonus = new CharacterAbilityBonus();
            CharacterAbilityENUM characterAbility = input();
            int value = input();
            characterAbilityBonus.setCharacterAbility(characterAbility);
            characterAbilityBonus.setValue(value);
            characterAbilities.add(characterAbilityBonus)
        }
        bonusFeatModel.setCharacterAbilities(characterAbilities);
        return new BonusFeat(bonusFeatModel);
    } else {
        return null;
    }
}

/*
 La magnitudo dei poteri di movimento, se definito si calcola 2*valore + 3*moltiplicatore
 Se si imposta follow si aggiunge 1.
*/
private IFeatAttribute 05_GetMovement() {
    boolean potereDiMovimento = input();
    if(potereDiMovimento) {
        bool follow = input();
        int meters = input();
        int multiplier = input();
        MovementFeatModel movementFeatModel = new MovementFeatModel();
        movementFeatModel.setFollow(follow);
        movementFeatModel.setValue(meters);
        movementFeatModel.setMultiplier(multiplier);
        return new MovementFeat(movementFeatModel);
    }
    return null;
}


/*
    La magnitudo qui si calcola in questo modo:
        Se la tipologia e' CONFRONTATION oDEFENSIVE e' 1
        Se e' OFFENSIVE e' 2 al quale si somma +3 se c'e' un influsso e la
        tipologia di danno:
            +1 per STUN
            +2 per BASE, DEBILITATING, INCAPACITATING, PERSISTENT o FLURRY
            +3 per EXTENDED
*/
private IFeatAttribute 06_GetCombat() {
    CombatTypeENUM combatType = input();
    CombatFeatModel combatFeatModel = new CombatFeatModel();
    combatFeatModel.setCombatType(combatFeatModel);
    if(combatType == CombatTypeENUM.NONE) {
        return null;
    } else if(combatType == CombatTypeENUM.OFFENSIVE) {
        InfluenceTypeENUM influenceType= input();
        DamageTypeENUM damageType = input();
        DamageModel damageModel = new DamageModel();
        damageModel.setInfluenceType(influenceType);
        damageModel.setDamageType(damageType);
        combatFeatModel.setDamageModel(damageModel);
    }
    return new CombatFeat(combatFeatModel);
}

/*
La magnitudo e' uguale al valore inserito.
*/
private IFeatAttribute 07_GetEditor() {
    EditorFeatModel editorFeatModel = new EditorFeatModel ();
    int value = input();
    editorFeatModel.setValue(value);
    if(editorFeatModel.getValue() == 0) {
        return null;
    } else {
        return new EditorFeat(editorFeatModel);
    }
    
}
```

## 1 Creazione

La fase di creazione di un gesto avviene attraverso i passi definiti
sul manuale.

Per prima cosa si deve poter scegliere a quale capacita' eroica
questa deve essere collegata. Il tool deve poter dare all'utente la
possibilita' di scegliere a quale capacita' eroica collegare il gesto
(Vedere Capacita' Eroiche.md per un riferimento). Poi avviene la
creazione vera e propria.

NOTA: Dal passo 2 in poi si usano le classi IFeatAttribute e i loro
      modelli. L'idea e' quella di popolare il relativo modello,
      creare l'IFeatAttribute corrispondente e aggiungerlo alla lista
      presente in HeroicFeat. Al termine di tutto verra' stampato uno
      l'oggetto HeroicFeat (vedi 1.1 Risultato).

  1. Nome e Descrizione: Per prima cosa si deve poter inserire un nome
     e una descrizione del gesto che si vuole creare.
  2. Locazione (BodyLocationFeat) Bisoga scegliere nessuna, una o piu'
     locazioni per il gesto (BodyLocationENUM). Nel caso in cui non si
     scelga alcuna locazione, la magnitudo per questo passo e' 0,
     altrimenti e' -1
  3. Durata (DurationFeat) Bisogna scegliere la durata del gesto
     (DurationENUM). A seconda della durata scelta si aggiunge un
     valore di magnitudo diverso:
        MOMENTARY: 1
        LIMITED:   2
        EXTENDED:  3
        UNLIMITED: 4
  4. Bersagli (TargetFeat) la scelta dei bersagli e' particolare,
     questa infatti puo' avvenire in due modi diversi combinabili: per
     distanza (contatto, a tot metri, sensoriale o senza limite) e/o
     per area.
     Distanza semplice: si definisce la distanza e quella e' la
     portata del potere. Si possono quindi colpire fino a un numero di
     nemici pari al valore di NumberOfTarget che stanno entro la
     distanza stabilita.
     Area: si definisce un'area all'interno del quale e' possibile
     esculdere un numero di bersagli pari a ExcludedTarget. Il dove
     si trova l'area di azione e' la combinazione di tipologia e
     Distanza Semplice. Se si imposta DEFINED come AreaTypeENUM si usa
     come riferimento la Distanza Semplice (si usa il modello
     DistanceModel per capire dove e' possibile piazzare l'area). Se
     questa non e' definita allora il centro e' se' stesso.
     Se si imposta SENSORY, l'area puo' essere piazzata a portata
     sensoriale (in pratica fin dove si vede) e si ignora la distanza
     semplice.
     Per gestire questo caso direi di chiedere all'utente se si vuole
     definire una distanza o un'area. Nel primo caso si passa poi alla
     definizione della distanza semplice (vedi dopo), nel caso scelga
     area, la si fa defnire e poi gli si chiede se deve essere
     centrata su se' stessi o no. Se e' centrata su se' stesso si
     prosegue con il prossimo punto, altrimenti gli si fa definire la
     distanza semplice (utilizzando lo stesso codice della distanza
     semplice).

     Distanza Semplice: Si chiede che tipo di distanza si vuole creare
     e si imposta la tipologia (DistanceTypeENUM): contatto,
     sensoriale, ovunque o definita. Nel caso in cui si scelga
     definita (DEFINED) si deve poi chiedere la portata in metri. La
     portata in metri e' costituita da un valore (DistanceValue) e un
     moltiplicatore (DistanceMultiplier). Il valore e' il numero di
     metri secco, mentre per ogni valore del moltiplicatore si
     moltiplica per 10m. Questo serve per risparmiare sulla magnitudo
     (costa meno 1 moltiplicatore che 10 metri secchi).
     Infine si chiede il numero di bersagli che si vogliono colpire.
     La magnitudo viene calcolata in questo modo a seconda della
     tipologia:
       Contatto: 1
       Sensoriale: 2
       Ovunque: 5
       Definita: 1 per ogni metro di portata e 2 per ogni
       moltiplicatore. ES: 30 metri sono 1 metro e 3 moltiplicatori,
       quindi totale: 1 + 2*3 = 7
     Per ogni bersaglio oltre al primo si aggiunge 3 alla magnitudo.

     Area: L'area puo' essere sensoriale o definita (AreaTypeENUM),
     quindi la prima cosa da chiedere all'utente e' quale delle due
     tipologie usare.
     Se definita si considera 1m di area a partire dal personaggio, al
     quale si possono applicare dei moltiplicatori (AreaMultiplier),
     ogni moltiplicatore aggiunge 10m di area. Si dovra' quindi
     chiedere all'utente di impostare il moltiplicatore. Una volta
     fatto questo si chiede all'utente se si vuole impostare una
     distanza, nel caso di risposta affermativa si passa alla
     definizione della distanza come descritto prima.
     Se l'area e' sensoriale e' a posto cosi' e non bisogna definire
     nient'altro.
     Infine dall'area si possono escludere dei bersagli, quindi
     si chiede all'utente fino a quanti bersagli escludere.
     La magnitudo si calcola in questo modo:
       Area di tipo Sensoriale: 5
       Area definita: 3 per il numero di moltiplicatori e si aggiunge
       2 al risultato. ES: area 20m diventa 3*2 + 2 = 8.
       All'area definita si aggiunge l'eventuale distanza.
     Poi si somma 2 per ogni bersagli escluso. ES: Area sensoriale con
     esculsione di 3 bersagli: 5 + 2*3 = 11
     
     


### 1.1 Risultato
Il risultato del processo di creazione e' la stampa dell'oggetto
HeroicFeat. Per questo sara' stampato
 * Nome
 * Descrizione
 * Magnitudo
 * Attributi

Esempio: Per la capacita' Affinita' Animale:

*Nome*: Balzi Prodigiosi

*Descrizione*: Consente al personaggio di spiccare balzi di 10 metri per
ogni punto di intensita', sia in altezza che in lunghezza, o una
qualunque combinazione delle due misure. Se al termine di un balzo il
personaggio atterra addosso a un bersaglio (Test di
Destrazza/Agilita' per tentare di colpirlo), gli infligge danno
potenziale uguale all'intensita'

*Magnitudo*: 8

*Attributi*:
 Locazione: Gambe (0)
 Durata: Istantanea (+1)
 Portata 10 metri (+3)
 Tipologia: Offensiva (+2)
 Danno: Base (+2)

NOTA: I valori tra parentesi sono quanto aggiunge alla magnitudo ogni
      attributo. In pratica il risultato di getMagnitude() di
      IFeatAttribute. Quello che viene prima dei ":" e' il nome,
      quello che viene dopo e' la descrizione. Quindi in questo caso
      BodyLocationFeat contiene un modello in qui sono state
      valorizzate gamba destra e gamba sinistra e i metodi
      restituiscono i seguenti valori:
        getName: "Locazione"
        getDescription(): "Gambe (0)"
        getMagnitude(): 0