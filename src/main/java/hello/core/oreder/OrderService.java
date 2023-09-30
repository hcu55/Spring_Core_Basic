package hello.core.oreder;

public interface OrderService {
    Order creteOrder(Long memberId, String itemName, int itemPrice);
}
