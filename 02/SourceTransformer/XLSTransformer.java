public class XLSTransformer extends AbstractTransformer{
  public void transformer(AbstractSource source) {
    source.getSource();
    System.out.println("将数据库转换成XLS");
  }
}