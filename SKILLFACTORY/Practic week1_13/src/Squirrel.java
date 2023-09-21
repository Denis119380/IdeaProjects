public class Squirrel {
    int[] nuts;
    public  Squirrel (int[] nuts1) {
        this.nuts = nuts1;
    }
    int getNuts(int index) {
        return nuts[index];
    }
    int maxNuts() {
        int sum = 0;
        int neg = -1;
        boolean negSum = false;
        for (int i = 0; i < nuts.length; i++) {
            if (nuts[i] > -1) {
                sum += nuts[i];
                negSum = false;
            }
            else {
                if (neg < nuts[i] && negSum) {
                    neg = nuts[i];
                    sum += neg;
                    negSum = false;
                }
                else if (neg > nuts[i] && negSum) {
                    sum += neg;
                    neg = nuts[i];
                    negSum = false;
                }
                else if (neg == nuts[i] && negSum) {
                    sum += neg;
                    neg = nuts[i];
                    negSum = false;
                }
                else if (neg > nuts[i] && !negSum) {
                    neg = nuts[i];
                    negSum = true;
                }
                else {
                    negSum = true;
                    neg = nuts[i];
                }
            }

        }
        return sum;
    }
}
