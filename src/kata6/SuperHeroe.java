package kata6;

import java.util.Arrays;

public class SuperHeroe {
    
    private String name;
    private int age;
    private String secretIdentity;
    private String[] powers;

    public SuperHeroe() {
    }

    public SuperHeroe(String name, int age, String secretIdentity, String[] powers) {
        this.name = name;
        this.age = age;
        this.secretIdentity = secretIdentity;
        this.powers = powers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public String[] getPowers() {
        return powers;
    }

    public void setPowers(String[] powers) {
        this.powers = powers;
    }

    @Override
    public String toString() {
        return "SuperHeroe{" + "name=" + name + ", age=" + age + ", secretIdentity=" + secretIdentity + ", powers=" + Arrays.toString(powers) + '}';
    }
    
}
