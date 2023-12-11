package codeGenerator.AddressStrategy;

public class IndirectAddressStrategy implements AddressStrategy {
    @Override
    public String returnString(int num) {
        return "@" + num;
    }
}
