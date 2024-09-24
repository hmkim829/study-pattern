package design.singleton;

/**
 * 왕국의 마법사
 *  - 시나리오
 *      - 어느 왕국에는 강력한 마법사가 한 명 있습니다.
 *      - 이 마법사는 왕국에서 일어나는 모든 마법적 사건을 관리하고 있습니다.
 *      - 왕국의 규칙에 따르면,
 *      - 이 마법사는 오직 한 명만 존재해야 하며,
 *      - 왕과 모든 백성은 이 마법사에게 언제든지 접근할 수 있어야 합니다.
 */
public class Wizard {

    private static Wizard uniqueWizard;
    private final String name;

    public Wizard(String name) {
        this.name = name;
    }

    public static Wizard getInstance(String name) {
        if (uniqueWizard == null) {
            uniqueWizard = new Wizard(name);
        }
        return uniqueWizard;
    }

    public void castSpell(String spell) {
        System.out.println(name + " 마법사가 " + spell + " 마법을 사용했습니다!");
    }
}
