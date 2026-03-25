class Netflix {
    private String webSeries[] = new String[18];
    int index;

    public boolean addWebSeries(String series) {
        if (series != null && !series.isEmpty()) {
            webSeries[index++] = series;
            return true;
        } else {
            System.out.println("Invalid web series");
            return false;
        }
    }

    public void getWebSeries() {
        for (String s : webSeries) {
            System.out.println(s);
        }
    }
}