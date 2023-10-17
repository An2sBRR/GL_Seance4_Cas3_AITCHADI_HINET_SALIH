public abstract class Decorateur implements TraitementTexte{
    TraitementTexte wrappee;
    String data;

    public Decorateur(TraitementTexte wrappee){
        this.wrappee = wrappee;
        this.data = wrappee.getData();
    }
    public void TraitementTexteWrappee(){
        this.wrappee.traitementTexte();
        this.data = wrappee.getData();
    }
    @Override
    public void traitementTexte() {

    }

    @Override
    public String getData() {
        return data;
    }
}
