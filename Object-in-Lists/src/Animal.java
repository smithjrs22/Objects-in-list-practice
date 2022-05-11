public class Animal {
    private String name;
    private Boolean ifDog; 

    public Animal(String name, Boolean ifDog){
        this.name = name;
        this.ifDog = ifDog;
    }


    public String getName(){
        return name;
    }

    public Boolean getifDog(){
        return ifDog; 
    }

    public String toString(){
        return getName() + " is a dog = " + getifDog();
    }
}