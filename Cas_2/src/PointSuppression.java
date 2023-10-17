public class PointSuppression extends Decorateur{
    public PointSuppression(TraitementTexte wrappee) {
        super(wrappee);
    }
    @Override
    public void traitementTexte() {
        TraitementTexteWrappee();
        data = data.replace(".","\n");
    }
}
