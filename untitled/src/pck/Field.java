package pck;

public class Field {
    private String label;
    private Form form;

    // Prywatny konstruktor — tylko Formularz może utworzyć Pole
    public Field(Form form, String label){
        this.form = form;
        this.label = label;
    }

    public Form getForm(){
        return this.form;
    }

    //wa obiekty Pole będą uznane za równe, jeśli mają taką samą wartość pola etykieta,
    // niezależnie od tego, do którego formularza należą.
    @Override
    public boolean equals(Object object){
        if(!(object instanceof Field)) return false;
        return ((Field)object).label.equals(this.label);
    }

    @Override
    public int hashCode(){
        return  this.label.hashCode();
    }
}
