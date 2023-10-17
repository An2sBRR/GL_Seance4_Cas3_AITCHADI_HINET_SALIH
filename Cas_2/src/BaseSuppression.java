public class BaseSuppression implements TraitementTexte{
    private String data;
    public BaseSuppression(String data){
        this.data = data;
    }
    @Override
    public void traitementTexte() {

    }

    @Override
    public String getData() {
        return data;
    }
}
