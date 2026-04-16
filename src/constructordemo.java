class human {
    private int age;
    private String name;

    public human() {
        this.age = age;
        this.name = name;
    }

    public int GetAge() {
        return age;
    }

    public void SetAge(int age) {
        this.age = age;
    }

    public String GetName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public static void main(String args[]) {
        human obj = new human();
        obj.SetAge(19);
        obj.SetName("sree");
        System.out.println(obj.GetName() + ":" + obj.GetAge());
    }
}

