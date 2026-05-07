public class staticLearn {
    
    String model;

    private staticLearn (String model) {
        this.model = model;
    }

    static staticLearn createCar(String model) {
        return new staticLearn(model);
    }
    public static void main(String[] args) {
            staticLearn c = staticLearn.createCar("BMW");
            System.out.println(c.model);

    }

}