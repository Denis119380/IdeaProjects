package mypack;
class AccountBalance {
    public static void main(String[] args) {

        Balance[] current = new Balance[3];

        current[0] = new Balance("Fielding", -1);
        current[1] = new Balance("Will Tell", 15);
        current[2] = new Balance("Tom Jakson", 45);

        for (int i = 0; i < 3; i++) current[i].show();
    }
}