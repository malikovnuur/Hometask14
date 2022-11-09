public class Singer extends Person {
    private String SongName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.SongName = bandName;
    }

    public void singing() {
        System.out.println("singing");
    }

    public void playGuitar() {
        System.out.println("playGuitar");
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public String toString() {
        return super.toString()+"\nname:"+SongName;
    }
}



