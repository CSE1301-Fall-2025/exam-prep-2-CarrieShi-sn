public static int sum (int n) {
    return sumHelper (n, 0);
}

public static int sumHelper (int n, int sum) {
    if (n == 0) {
        return sum;
    } else {
        return sumHelper (n/10, sum + (n % 10));
    }
}