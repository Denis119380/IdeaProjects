public class Mage {

    String name;
    int level;
    int damage;
    String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
//        String info;
//        info = "{" + name + ", " + level + ", " + damage + ", " + type + "}";
//        return info;
        return name + ", " + level + ", " + damage + ", " + type;
    }

    String fight(Mage mage) {
//        String result;
//            if (mage.type.equals("fire") && this.type.equals("ice") || mage.type.equals("ice") && this.type.equals("earth") || mage.type.equals("earth") && this.type.equals("fire")) {
//                result = "Winner " + mage.name;
//            } else if (mage.type.equals("ice") && this.type.equals("fire") || mage.type.equals("earth") && this.type.equals("ice") || mage.type.equals("fire") && this.type.equals("earth")) {
//                result = "Wnner " + this.name;
        if (this.type.equals("fire") && mage.type.equals("ice")) return this.name;
        else if (this.type.equals("ice") && mage.type.equals("earth")) return this.name;
        else if (this.type.equals("earth") && mage.type.equals("fire")) return this.name;
        else if (!this.type.equals(mage.type)) return mage.name;
        else {
            if (this.level > mage.level) return this.name;
            else if (this.level < mage.level) return mage.name;
            else {
                if (this.damage > mage.damage) return this.name;
                else if (this.damage < mage.damage) return mage.name;
                else return "draw";
            }
        }
    }
}
//                if (mage.level > this.level) return mage.name;
//                    else if (mage.level < this.level) {
//                    result = "Wnner " + this.name;
//            } else {
//                    if (mage.damage > this.damage) {
//                        result = "Winner " + mage.name;
//                    } else  if (mage.damage < this.damage) {
//                        result = "Wnner " + this.name;
//                    } else {
//                        result = "draw";
//                    }
//                }
//        }
//            return result;
//    }