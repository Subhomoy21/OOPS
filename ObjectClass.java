class Laptop{
    String  model;
    int price;

    public String toString(){
        return model + " : " + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}
public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenevo 5000";
        obj.price = 70000;
        System.out.println(obj); //Laptop@36baf30c
        System.out.println(obj.toString()); //Laptop@36baf30c prints same thing

        System.out.println(obj);
        Laptop obj2 = new Laptop();
        obj2.model = "Lenevo 5000";
        obj2.price = 70000;

        boolean result = obj.equals(obj2);
        System.out.println(result);
    }
}
