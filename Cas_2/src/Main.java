public class Main {
    public static void main(String[] args) {
        Extraction extraction = new Extraction();
        String data = extraction.extractionData();
        TraitementTexte point = new EspaceSuppression(new PointSuppression(new PointVirguleSuppression(new BaseSuppression(data))));
        point.traitementTexte();
        Enregistrement enregistrement = new Enregistrement();
        enregistrement.sauvegarder(point.getData());

    }
}