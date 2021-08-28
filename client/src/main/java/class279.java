import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class279 {
   public static Comparator field3616 = new class282();
   public static Comparator field3618;
   public static Comparator field3619;
   public static Comparator field3620;
   public final List field3617;

   static {
      new class284();
      field3618 = new class287();
      field3620 = new class281();
      field3619 = new class280();
   }

   public class279(Buffer var1, boolean var2) {
      int var3 = var1.readUnsignedShort();
      boolean var4 = var1.readUnsignedByte() == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.readUnsignedShort();
      this.field3617 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field3617.add(new class285(var1, var5, var3));
      }

   }

   public void method4510(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.field3617, var1);
      } else {
         Collections.sort(this.field3617, Collections.reverseOrder(var1));
      }

   }
}
