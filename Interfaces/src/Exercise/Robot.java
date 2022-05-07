package Exercise;

class Robot {
    private final String id;
    private final String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getId() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }
}
