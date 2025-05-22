package pck;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Form {
    private String name;
    private List<Field> fields = new ArrayList<>();
    private static Set<Field> allFields = new HashSet<>();

    public Form(String name){
        this.name = name;
    }

    public Field createField(String label) throws Exception{
        Field field = new Field(this, label);
        if (allFields.contains(field)){
            throw new Exception("This field is already in another form");
        }
        fields.add(field);
        allFields.add(field);
        return field;
    }
}
