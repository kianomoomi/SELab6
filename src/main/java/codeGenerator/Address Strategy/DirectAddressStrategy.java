package codeGenerator.AddressStrategy;

public class DirectAddressStrategy implements AddressStrategy {
    @Override
    public String returnString(int num) {
        return num + "";
    }
}
