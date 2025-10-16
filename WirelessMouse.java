class WirelessMouse extends Mouse {
    void click() {
	System.out.println("Wireless mouse clicked");
	}
    void scroll() {
	System.out.println("Wireless scrolling"); 
	}
}

    public static void main(String[] args) {
        Mouse m = new Mouse();
        Mouse.connect(); Mouse.disconnect();
        m.click(); m.scroll();

        WirelessMouse w = new WirelessMouse();
        WirelessMouse.connect(); WirelessMouse.disconnect();
        w.click(); w.scroll();

        Mouse m2 = new WirelessMouse();
        m2.click(); m2.scroll();
    }
}