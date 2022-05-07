package Lab.BorderControl;

 interface Identifiable {
    String getId();
    default String print(){
        return "M";
    }
}
