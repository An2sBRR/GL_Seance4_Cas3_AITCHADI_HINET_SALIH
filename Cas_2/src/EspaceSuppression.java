public class EspaceSuppression extends Decorateur{
    public EspaceSuppression(TraitementTexte wrappee) {
        super(wrappee);
    }

    @Override
    public void traitementTexte() {
        TraitementTexteWrappee();
        data = data.replace(" ","");
    }
}
