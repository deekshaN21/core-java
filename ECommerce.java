class ECommerce {
    private String productNames[] = new String[26];
    int index;

    public boolean addProduct(String p) {
        if (p != null && !p.isEmpty()) {
            productNames[index++] = p;
            return true;
        }
        return false;
    }

    public void getProducts() {
        for (String p : productNames) {
            System.out.println(p);
        }
    }
}