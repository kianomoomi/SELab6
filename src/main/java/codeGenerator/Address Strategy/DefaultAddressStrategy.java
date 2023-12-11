package codeGenerator.AddressStrategy;

public class DefaultAddressStrategy implements AddressStrategy {

    @Override
    public String returnString(int num) {
        return num + "";
    }
}
