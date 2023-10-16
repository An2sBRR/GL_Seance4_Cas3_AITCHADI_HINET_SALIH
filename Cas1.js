// Constructeur de voiture
function Voiture(modele) {
    this.modele = modele;
    this.options = [];
  }
  
  // Fonction pour ajouter une option à la voiture
  Voiture.prototype.ajouterOption = function (option) {
    this.options.push(option);
  };
  
  // Fonction pour afficher la liste des options de la voiture
  Voiture.prototype.afficherOptions = function () {
    console.log(`\nOptions pour voiture ${this.modele}: \n`);
    this.options.forEach(option => {
      console.log(option);
    });
  };
  
  // Création des objets prototypes pour les packs d'options
  const PrototypePackStandard = {
    ajouterOptionsPourStandard: function () {
      this.ajouterOption('Kit radio');
      this.ajouterOption('Téléphone');
    }
  };
  
  const PrototypePackFamilial = {
    ajouterOptionsPourFamilial: function () {
      this.ajouterOption('Siège enfant');
      this.ajouterOption('Miroirs');
    }
  };
  
  const PrototypePackSportif = {
    ajouterOptionsPourSportif: function () {
      this.ajouterOption('Suspensions spécifiques');
      this.ajouterOption('Jantes spécifiques');
    }
  };
  
  function main() {

    // Création de voitures (avec le constructeur Voiture)
    const Voiture1 = new Voiture('Standard');
    const Voiture2 = new Voiture('Familiale');
    const Voiture3 = new Voiture('Sportive');
    const Voiture4 = new Voiture('Familiale décapotable');
  
    // Utilisation des objets prototypes pour ajouter des options aux voitures
    Object.assign(Voiture1, PrototypePackStandard);
    Object.assign(Voiture2, PrototypePackFamilial);
    Object.assign(Voiture3, PrototypePackSportif);
  
   
  
    Voiture1.ajouterOptionsPourStandard(); // Ajout du pack standard à la voiture 1
    Voiture2.ajouterOptionsPourFamilial();  // Ajout du pack familial à la voiture 2
    Voiture3.ajouterOptionsPourSportif();  // Ajout du pack sport à la voiture 3
  
    PrototypePackSportif.ajouterOptionsPourSportif.call(Voiture4); // Ajout du pack sportif à la voiture 4
    Voiture4.ajouterOption('Toit ouvrant'); // Ajout de la nouvelle option en plus du pack sportif
  
    // Affichage des options de chaque voiture
    Voiture1.afficherOptions();
    Voiture2.afficherOptions();
    Voiture3.afficherOptions();
    Voiture4.afficherOptions();
  }
 

  main();

 

  