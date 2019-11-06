public class Person<X, Y> {
    private X id;
    private Y name;

    public Person(X id, Y name) {
        this.id = id;
        this.name = name;
    }

    public X getId() {
        return id;
    }

    public void setId(X id) {
        this.id = id;
    }

    public Y getName() {
        return name;
    }

    public void setName(Y name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

    public <E> E test(E e){
        return e;
    }

    {
        String getTest = this.test("test_test");
    }
}
