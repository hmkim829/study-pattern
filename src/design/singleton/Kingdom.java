package design.singleton;

public class Kingdom {
    public static void main(String[] args) {
        // 왕이 마법사를 호출함
        Wizard wizard1 = Wizard.getInstance("Merlin");
        wizard1.castSpell("Fireball");

        // 백성들이 다른 마법사를 요청해도 같은 마법사가 나타남
        Wizard wizard2 = Wizard.getInstance("Gandalf");
        wizard2.castSpell("Lightning");

        // wizard1과 wizard2는 같은 인스턴스임을 확인
        System.out.println("wizard1과 wizard2가 같은 인스턴스인가요? " + (wizard1 == wizard2));
    }
}