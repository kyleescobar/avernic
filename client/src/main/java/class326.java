import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class326 {
   class324[] field3859;
   int field3858 = 0;
   Comparator field3857 = null;
   HashMap field3861;
   HashMap field3862;
   final int field3860;

   class326(int var1) {
      this.field3860 = var1;
      this.field3859 = this.method5241(var1);
      this.field3861 = new HashMap(var1 / 8);
      this.field3862 = new HashMap(var1 / 8);
   }

   public void method5185() {
      this.field3858 = 0;
      Arrays.fill(this.field3859, (Object)null);
      this.field3861.clear();
      this.field3862.clear();
   }

   public int method5200() {
      return this.field3858;
   }

   public boolean method5253() {
      return this.field3860 == this.field3858;
   }

   public boolean method5210(class406 var1) {
      if (!var1.method6523()) {
         return false;
      } else {
         return this.field3861.containsKey(var1) ? true : this.field3862.containsKey(var1);
      }
   }

   public class324 method5189(class406 var1) {
      class324 var3 = this.method5190(var1);
      return null != var3 ? var3 : this.method5191(var1);
   }

   class324 method5190(class406 var1) {
      return !var1.method6523() ? null : (class324)this.field3861.get(var1);
   }

   class324 method5191(class406 var1) {
      return !var1.method6523() ? null : (class324)this.field3862.get(var1);
   }

   public final boolean method5192(class406 var1) {
      class324 var3 = this.method5190(var1);
      if (null == var3) {
         return false;
      } else {
         this.method5193(var3);
         return true;
      }
   }

   final void method5193(class324 var1) {
      int var3 = this.method5199(var1);
      if (var3 != -1) {
         this.method5216(var3);
         this.method5184(var1);
      }
   }

   class324 method5194(class406 var1) {
      return this.method5242(var1, (class406)null);
   }

   class324 method5242(class406 var1, class406 var2) {
      if (this.method5190(var1) != null) {
         throw new IllegalStateException();
      } else {
         class324 var4 = this.method5187();
         var4.method5157(var1, var2);
         this.method5201(var4);
         this.method5202(var4);
         return var4;
      }
   }

   public final class324 method5196(int var1) {
      if (var1 >= 0 && var1 < this.field3858) {
         return this.field3859[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   public final void method5197() {
      if (this.field3857 == null) {
         Arrays.sort(this.field3859, 0, this.field3858);
      } else {
         Arrays.sort(this.field3859, 0, this.field3858, this.field3857);
      }

   }

   final void method5198(class324 var1, class406 var2, class406 var3) {
      this.method5184(var1);
      var1.method5157(var2, var3);
      this.method5202(var1);
   }

   final int method5199(class324 var1) {
      for(int var3 = 0; var3 < this.field3858; ++var3) {
         if (this.field3859[var3] == var1) {
            return var3;
         }
      }

      return -1;
   }

   final void method5184(class324 var1) {
      if (this.field3861.remove(var1.field3853) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field3852 != null) {
            this.field3862.remove(var1.field3852);
         }

      }
   }

   final void method5201(class324 var1) {
      this.field3859[++this.field3858 - 1] = var1;
   }

   final void method5202(class324 var1) {
      this.field3861.put(var1.field3853, var1);
      if (var1.field3852 != null) {
         class324 var3 = (class324)this.field3862.put(var1.field3852, var1);
         if (var3 != null && var1 != var3) {
            var3.field3852 = null;
         }
      }

   }

   final void method5216(int var1) {
      --this.field3858;
      if (var1 < this.field3858) {
         System.arraycopy(this.field3859, var1 + 1, this.field3859, var1, this.field3858 - var1);
      }

   }

   public final void method5249() {
      this.field3857 = null;
   }

   public final void method5239(Comparator var1) {
      if (null == this.field3857) {
         this.field3857 = var1;
      } else if (this.field3857 instanceof class325) {
         ((class325)this.field3857).method5177(var1);
      }

   }

   abstract class324 method5187();

   abstract class324[] method5241(int var1);
}
