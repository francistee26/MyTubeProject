public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequirst(ip);
        System.out.println(html);
    }

    private String sendHttpRequirst(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}