public class class321 extends class328 {
   boolean field3842;
   boolean field3843;

   class321() {
   }

   int method5131(class321 var1) {
      if (super.field3865 == client.field405 && client.field405 != var1.field3865) {
         return -1;
      } else if (client.field405 == var1.field3865 && client.field405 != super.field3865) {
         return 1;
      } else if (0 != super.field3865 && 0 == var1.field3865) {
         return -1;
      } else if (0 != var1.field3865 && 0 == super.field3865) {
         return 1;
      } else if (this.field3843 && !var1.field3843) {
         return -1;
      } else if (!this.field3843 && var1.field3843) {
         return 1;
      } else if (this.field3842 && !var1.field3842) {
         return -1;
      } else if (!this.field3842 && var1.field3842) {
         return 1;
      } else {
         return 0 != super.field3865 ? super.field3869 - var1.field3869 : var1.field3869 - super.field3869;
      }
   }

   public int method5158(class324 var1) {
      return this.method5131((class321)var1);
   }

   public int compareTo(Object var1) {
      return this.method5131((class321)var1);
   }
}
