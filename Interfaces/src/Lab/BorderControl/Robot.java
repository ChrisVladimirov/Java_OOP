package Lab.BorderControl;

 class Robot implements Identifiable {
    private String model;
    private String Id;

    public Robot(String model, String id) {
        this.model = model;
        this.Id = id;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getId() {
        return this.Id;
    }
}
