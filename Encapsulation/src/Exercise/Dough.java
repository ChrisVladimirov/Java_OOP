package Exercise;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String backingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(backingTechnique);
        this.setWeight(weight);
    }

    public String getFlourType() {
        return flourType;
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
            case "Chewy":
            case "Homemade":
                this.bakingTechnique = bakingTechnique;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public double calculateCalories() {
        double flourTypeModifier = this.getFlourTypeModifier(this.flourType);
        double bakingTechniqueModifier = this.getBakingTechniqueModifier(this.bakingTechnique);
        return 2 * this.weight * flourTypeModifier * bakingTechniqueModifier;
    }

    private double getBakingTechniqueModifier(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
                return 0.9;
            case "Chewy":
                return 1.1;
            case "Homemade":
                return 1;
            default:
                return 0;
        }
    }

  /*  private double getDoughTypeModifier(String flourType) {
        switch (flourType) {
            case "White":
                return 1.5;
            case "Wholegrain":
            case "Homemade":
                return 1.0;
            case "Crispy":
                return 0.9;
            case "Chewy":
                return 1.1;
            default:
                return 0;
        }
    }*/

    private double getFlourTypeModifier(String flourType) {
        if (flourType.equals("White")) {
            return 1.5;
        } else if (flourType.equals("Wholegrain")) {
            return 1;
        } else {
            return 0;
        }
    }
}
