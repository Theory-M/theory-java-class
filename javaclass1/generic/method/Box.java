package pl.learn.theory.javaclass1.generic.method;

public class Box {
    // co moze ten pojemnik przechowac
    private String string;
    private Object object;
    private Integer integer;
    private Double aDouble;

    public Box(String string, Object object, Integer integer, Double aDouble) {
        this.string = validate(string);
        this.object = validate(object);
        this.integer = validate(integer);
        this.aDouble = validate(aDouble);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = validate(string);
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = validate(object);
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = validate(integer);
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = validate(aDouble);
    }
//    private String validateString (String string){
//        if (null == string){
//            throw new IllegalArgumentException("cannot be null");
//        }
//        return string;
//    }
//    private Object validateObject (Object object){
//        if (null == object){
//            throw new IllegalArgumentException("cannot be null");
//        }
//        return object;
//    }
//    private Integer validateInteger (Integer integer){
//        if (null == integer){
//            throw new IllegalArgumentException("cannot be null");
//        }
//        return integer;
//    }
//    private Double validateDouble (Double aDouble){
//        if (null == aDouble){
//            throw new IllegalArgumentException("cannot be null");
//        }
//        return aDouble;
//    }
    private <T>T validate (T value){
        if (null == value){
            throw new IllegalArgumentException("cannot be null");
        }
        return value;
    }
}
