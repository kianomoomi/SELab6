package codeGenerator.AddressStrategy;

public class ImmidiateAddressStrategy implements AddressStrategy{
    @Override
    public String returnString(int num) {
        return "#" + num;
    }
}
