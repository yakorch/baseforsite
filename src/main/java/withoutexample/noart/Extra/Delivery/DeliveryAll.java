package withoutexample.noart.Extra.Delivery;

public enum DeliveryAll {
    PostDelivery,  DHLDelivery, None;

    public static boolean handleDelivery(DeliveryAll deliveryAll){
        return deliveryAll != DeliveryAll.None;
    }
}
