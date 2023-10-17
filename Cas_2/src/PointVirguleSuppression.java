public class PointVirguleSuppression extends Decorateur{
    public PointVirguleSuppression(TraitementTexte wrappee){
        super(wrappee);
    }
    @Override
    public void traitementTexte() {
        TraitementTexteWrappee();
        data = data.replace(";","");
    }
}
