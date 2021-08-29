import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class359 {
   static final class361 field4029;
   static final class361 field4054;
   static final class361 field4076;
   boolean field4052 = false;
   boolean field4063 = true;
   boolean field4068 = false;
   class168 field4035;
   class168 field4037;
   class168 field4067;
   class170 field4038;
   class245 field4074 = null;
   class277 field4027;
   class277 field4032;
   class277 field4044;
   class302 field4075;
   class358 field4039;
   class397[] field4033;
   class398 field4066;
   float field4022;
   float field4045;
   int field4025;
   int field4028 = -1;
   int field4030;
   int field4040;
   int field4042 = -1;
   int field4046 = -1;
   int field4047 = -1;
   int field4049 = -1;
   int field4050 = 3;
   int field4051 = 50;
   int field4055 = -1;
   int field4056 = -1;
   int field4057 = -1;
   int field4059 = -1;
   int field4060 = -1;
   int field4061;
   int field4062;
   int field4069 = 0;
   int field4070 = -1;
   int field4077 = -1;
   int field4078 = -1;
   int field4079 = -1;
   int field4080 = -1;
   HashMap field4043;
   HashMap field4058;
   HashSet field4023 = new HashSet();
   HashSet field4048 = new HashSet();
   HashSet field4053 = null;
   HashSet field4064 = new HashSet();
   HashSet field4065 = new HashSet();
   HashSet field4073 = new HashSet();
   Iterator field4031;
   List field4071;
   long field4072;
   final int[] field4021 = new int[]{1008, 1009, 1010, 1011, 1012};
   public boolean field4026 = false;

   static LoginPacket[] method5692() {
      return new LoginPacket[]{LoginPacket.RECONNECT_LOGIN, LoginPacket.field2791, LoginPacket.NORMAL_LOGIN, LoginPacket.field2794, LoginPacket.field2792, LoginPacket.field2797};
   }

   static {
      field4054 = class361.field4087;
      field4029 = class361.field4088;
      field4076 = class361.field4096;
   }

   public void method5544(class277 var1, class277 var2, class277 var3, class302 var4, HashMap var5, class397[] var6) {
      this.field4033 = var6;
      this.field4044 = var1;
      this.field4032 = var2;
      this.field4027 = var3;
      this.field4075 = var4;
      this.field4058 = new HashMap();
      this.field4058.put(class165.field1917, var5.get(field4054));
      this.field4058.put(class165.field1922, var5.get(field4029));
      this.field4058.put(class165.field1918, var5.get(field4076));
      this.field4039 = new class358(var1);
      int var8 = this.field4044.readGroup(class187.field2118.field2114);
      int[] var9 = this.field4044.method4481(var8);
      this.field4043 = new HashMap(var9.length);

      for(int var10 = 0; var10 < var9.length; ++var10) {
         Buffer var11 = new Buffer(this.field4044.method4412(var8, var9[var10]));
         class168 var12 = new class168();
         var12.method2890(var11, var9[var10]);
         this.field4043.put(var12.method2899(), var12);
         if (var12.method2889()) {
            this.field4035 = var12;
         }
      }

      this.method5497(this.field4035);
      this.field4037 = null;
   }

   public void method5650() {
      class169.field1962.method3862(5);
   }

   public void method5484(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.field4039.method5470()) {
         this.method5487();
         this.method5482();
         if (var3) {
            int var9 = (int)Math.ceil((double)((float)var6 / this.field4022));
            int var10 = (int)Math.ceil((double)((float)var7 / this.field4022));
            List var11 = this.field4038.method3079(this.field4030 - var9 / 2 - 1, this.field4025 - var10 / 2 - 1, 1 + var9 / 2 + this.field4030, 1 + var10 / 2 + this.field4025, var4, var5, var6, var7, var1, var2);
            HashSet var12 = new HashSet();

            Iterator var13;
            class186 var14;
            class68 var15;
            class191 var16;
            for(var13 = var11.iterator(); var13.hasNext(); class95.method2055(var15)) {
               var14 = (class186)var13.next();
               var12.add(var14);
               var15 = new class68();
               var16 = new class191(var14.method3208(), var14.field2111, var14.field2110);
               var15.method1683(new Object[]{var16, var1, var2});
               if (this.field4073.contains(var14)) {
                  var15.method1684(17);
               } else {
                  var15.method1684(15);
               }
            }

            var13 = this.field4073.iterator();

            while(var13.hasNext()) {
               var14 = (class186)var13.next();
               if (!var12.contains(var14)) {
                  var15 = new class68();
                  var16 = new class191(var14.method3208(), var14.field2111, var14.field2110);
                  var15.method1683(new Object[]{var16, var1, var2});
                  var15.method1684(16);
                  class95.method2055(var15);
               }
            }

            this.field4073 = var12;
         }
      }
   }

   public void method5485(int var1, int var2, boolean var3, boolean var4) {
      long var6 = class87.method1989();
      this.method5486(var1, var2, var4, var6);
      if (this.method5517() || !var4 && !var3) {
         this.method5490();
      } else {
         if (var4) {
            this.field4079 = var1;
            this.field4059 = var2;
            this.field4056 = this.field4030;
            this.field4057 = this.field4025;
         }

         if (this.field4056 != -1) {
            int var8 = var1 - this.field4079;
            int var9 = var2 - this.field4059;
            this.method5489(this.field4056 - (int)((float)var8 / this.field4045), (int)((float)var9 / this.field4045) + this.field4057, false);
         }
      }

      if (var4) {
         this.field4072 = var6;
         this.field4061 = var1;
         this.field4062 = var2;
      }

   }

   void method5486(int var1, int var2, boolean var3, long var4) {
      if (this.field4067 != null) {
         int var6 = (int)((float)this.field4030 + ((float)(var1 - this.field4060) - (float)this.method5519() * this.field4022 / 2.0F) / this.field4022);
         int var7 = (int)((float)this.field4025 - ((float)(var2 - this.field4049) - (float)this.method5520() * this.field4022 / 2.0F) / this.field4022);
         this.field4074 = this.field4067.method2895(var6 + this.field4067.method2949() * 64, var7 + this.field4067.method2905() * 64);
         if (null != this.field4074 && var3) {
            if (class143.method2427() && KeyHandler.pressedKeys[82] && KeyHandler.pressedKeys[81]) {
               class343.method5419(this.field4074.field2920, this.field4074.field2922, this.field4074.field2921, false);
            } else {
               boolean var8 = true;
               if (this.field4063) {
                  int var9 = var1 - this.field4061;
                  int var10 = var2 - this.field4062;
                  if (var4 - this.field4072 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                     var8 = false;
                  }
               }

               if (var8) {
                  PacketBufferNode var11 = class149.getPacketBufferNode(ClientPacket.field2667, client.packetWriter.isaacCipher);
                  var11.packetBuffer.method5992(this.field4074.method4161());
                  client.packetWriter.addNode(var11);
                  this.field4072 = 0L;
               }
            }
         }
      } else {
         this.field4074 = null;
      }

   }

   void method5487() {
      if (null != class368.field4128) {
         this.field4022 = this.field4045;
      } else {
         if (this.field4022 < this.field4045) {
            this.field4022 = Math.min(this.field4045, this.field4022 + this.field4022 / 30.0F);
         }

         if (this.field4022 > this.field4045) {
            this.field4022 = Math.max(this.field4045, this.field4022 - this.field4022 / 30.0F);
         }

      }
   }

   void method5482() {
      if (this.method5517()) {
         int var2 = this.field4042 - this.field4030;
         int var3 = this.field4070 - this.field4025;
         if (0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         if (0 != var3) {
            var3 /= Math.min(8, Math.abs(var3));
         }

         this.method5489(var2 + this.field4030, this.field4025 + var3, true);
         if (this.field4042 == this.field4030 && this.field4070 == this.field4025) {
            this.field4042 = -1;
            this.field4070 = -1;
         }

      }
   }

   final void method5489(int var1, int var2, boolean var3) {
      this.field4030 = var1;
      this.field4025 = var2;
      class87.method1989();
      if (var3) {
         this.method5490();
      }

   }

   final void method5490() {
      this.field4059 = -1;
      this.field4079 = -1;
      this.field4057 = -1;
      this.field4056 = -1;
   }

   boolean method5517() {
      return -1 != this.field4042 && this.field4070 != -1;
   }

   public class168 method5492(int var1, int var2, int var3) {
      Iterator var5 = this.field4043.values().iterator();

      class168 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class168)var5.next();
      } while(!var6.method2892(var1, var2, var3));

      return var6;
   }

   public void method5488(int var1, int var2, int var3, boolean var4) {
      class168 var6 = this.method5492(var1, var2, var3);
      if (null == var6) {
         if (!var4) {
            return;
         }

         var6 = this.field4035;
      }

      boolean var7 = false;
      if (this.field4037 != var6 || var4) {
         this.field4037 = var6;
         this.method5497(var6);
         var7 = true;
      }

      if (var7 || var4) {
         this.method5609(var1, var2, var3);
      }

   }

   public void method5494(int var1) {
      class168 var3 = this.method5511(var1);
      if (var3 != null) {
         this.method5497(var3);
      }

   }

   public int method5495() {
      return null == this.field4067 ? -1 : this.field4067.method2897();
   }

   public class168 method5551() {
      return this.field4067;
   }

   void method5497(class168 var1) {
      if (this.field4067 == null || var1 != this.field4067) {
         this.method5640(var1);
         this.method5609(-1, -1, -1);
      }
   }

   void method5640(class168 var1) {
      this.field4067 = var1;
      this.field4038 = new class170(this.field4033, this.field4058, this.field4032, this.field4027);
      this.field4039.method5468(this.field4067.method2899());
   }

   public void method5499(class168 var1, class245 var2, class245 var3, boolean var4) {
      if (null != var1) {
         if (null == this.field4067 || this.field4067 != var1) {
            this.method5640(var1);
         }

         if (!var4 && this.field4067.method2892(var2.field2921, var2.field2920, var2.field2922)) {
            this.method5609(var2.field2921, var2.field2920, var2.field2922);
         } else {
            this.method5609(var3.field2921, var3.field2920, var3.field2922);
         }

      }
   }

   void method5609(int var1, int var2, int var3) {
      if (null != this.field4067) {
         int[] var5 = this.field4067.method2928(var1, var2, var3);
         if (var5 == null) {
            var5 = this.field4067.method2928(this.field4067.method2908(), this.field4067.method2918(), this.field4067.method2909());
         }

         this.method5489(var5[0] - this.field4067.method2949() * 64, var5[1] - this.field4067.method2905() * 64, true);
         this.field4042 = -1;
         this.field4070 = -1;
         this.field4022 = this.method5538(this.field4067.method2925());
         this.field4045 = this.field4022;
         this.field4071 = null;
         this.field4031 = null;
         this.field4038.method3073();
      }
   }

   public void method5501(int var1, int var2, int var3, int var4, int var5) {
      int[] var7 = new int[4];
      class394.method6259(var7);
      class394.method6279(var1, var2, var1 + var3, var2 + var4);
      class394.method6265(var1, var2, var3, var4, -16777216);
      int var8 = this.field4039.method5474();
      if (var8 < 100) {
         this.method5648(var1, var2, var3, var4, var8);
      } else {
         if (!this.field4038.method3097()) {
            this.field4038.method3072(this.field4044, this.field4067.method2899(), client.field562);
            if (!this.field4038.method3097()) {
               return;
            }
         }

         if (this.field4053 != null) {
            ++this.field4055;
            if (this.field4055 % this.field4051 == 0) {
               this.field4055 = 0;
               ++this.field4077;
            }

            if (this.field4077 >= this.field4050 && !this.field4052) {
               this.field4053 = null;
            }
         }

         int var9 = (int)Math.ceil((double)((float)var3 / this.field4022));
         int var10 = (int)Math.ceil((double)((float)var4 / this.field4022));
         this.field4038.method3074(this.field4030 - var9 / 2, this.field4025 - var10 / 2, var9 / 2 + this.field4030, var10 / 2 + this.field4025, var1, var2, var1 + var3, var4 + var2);
         if (!this.field4068) {
            boolean var11 = false;
            if (var5 - this.field4069 > 100) {
               this.field4069 = var5;
               var11 = true;
            }

            this.field4038.method3106(this.field4030 - var9 / 2, this.field4025 - var10 / 2, this.field4030 + var9 / 2, var10 / 2 + this.field4025, var1, var2, var1 + var3, var2 + var4, this.field4023, this.field4053, this.field4055, this.field4051, var11);
         }

         this.method5503(var1, var2, var3, var4, var9, var10);
         if (class143.method2427() && this.field4026 && null != this.field4074) {
            this.field4075.method4853("Coord: " + this.field4074, class394.field4249 + 10, 20 + class394.field4247, 16776960, -1);
         }

         this.field4046 = var9;
         this.field4047 = var10;
         this.field4060 = var1;
         this.field4049 = var2;
         class394.method6260(var7);
      }
   }

   boolean method5502(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null == this.field4066) {
         return true;
      } else if (var1 == this.field4066.field4270 && this.field4066.field4271 == var2) {
         if (this.field4038.field1989 != this.field4040) {
            return true;
         } else if (client.field680 != this.field4080) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var1 + var3 < var5 || var2 + var4 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   void method5503(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != class368.field4128) {
         int var8 = 512 / (this.field4038.field1989 * 2);
         int var9 = var3 + 512;
         int var10 = 512 + var4;
         float var11 = 1.0F;
         var9 = (int)((float)var9 / var11);
         var10 = (int)((float)var10 / var11);
         int var12 = this.method5516() - var5 / 2 - var8;
         int var13 = this.method5561() - var6 / 2 - var8;
         int var14 = var1 - (var12 + var8 - this.field4078) * this.field4038.field1989;
         int var15 = var2 - this.field4038.field1989 * (var8 - (var13 - this.field4028));
         if (this.method5502(var9, var10, var14, var15, var3, var4)) {
            if (null != this.field4066 && this.field4066.field4270 == var9 && this.field4066.field4271 == var10) {
               Arrays.fill(this.field4066.field4280, 0);
            } else {
               this.field4066 = new class398(var9, var10);
            }

            this.field4078 = this.method5516() - var5 / 2 - var8;
            this.field4028 = this.method5561() - var6 / 2 - var8;
            this.field4040 = this.field4038.field1989;
            class368.field4128.method4598(this.field4078, this.field4028, this.field4066, (float)this.field4040 / var11);
            this.field4080 = client.field680;
            var14 = var1 - this.field4038.field1989 * (var8 + var12 - this.field4078);
            var15 = var2 - this.field4038.field1989 * (var8 - (var13 - this.field4028));
         }

         class394.method6264(var1, var2, var3, var4, 0, 128);
         if (var11 == 1.0F) {
            this.field4066.method6389(var14, var15, 192);
         } else {
            this.field4066.method6392(var14, var15, (int)((float)var9 * var11), (int)(var11 * (float)var10), 192);
         }
      }

   }

   public void method5504(int var1, int var2, int var3, int var4) {
      if (this.field4039.method5470()) {
         if (!this.field4038.method3097()) {
            this.field4038.method3072(this.field4044, this.field4067.method2899(), client.field562);
            if (!this.field4038.method3097()) {
               return;
            }
         }

         this.field4038.method3096(var1, var2, var3, var4, this.field4053, this.field4055, this.field4051);
      }
   }

   public void method5612(int var1) {
      this.field4045 = this.method5538(var1);
   }

   void method5648(int var1, int var2, int var3, int var4, int var5) {
      byte var7 = 20;
      int var8 = var3 / 2 + var1;
      int var9 = var2 + var4 / 2 - 18 - var7;
      class394.method6265(var1, var2, var3, var4, -16777216);
      class394.method6292(var8 - 152, var9, 304, 34, -65536);
      class394.method6265(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
      this.field4075.method4922(class270.field3527, var8, var9 + var7, -1, -1);
   }

   float method5538(int var1) {
      if (25 == var1) {
         return 1.0F;
      } else if (var1 == 37) {
         return 1.5F;
      } else if (var1 == 50) {
         return 2.0F;
      } else if (var1 == 75) {
         return 3.0F;
      } else {
         return 100 == var1 ? 4.0F : 8.0F;
      }
   }

   public int method5508() {
      if (1.0D == (double)this.field4045) {
         return 25;
      } else if (1.5D == (double)this.field4045) {
         return 37;
      } else if ((double)this.field4045 == 2.0D) {
         return 50;
      } else if (3.0D == (double)this.field4045) {
         return 75;
      } else {
         return 4.0D == (double)this.field4045 ? 100 : 200;
      }
   }

   public void method5509() {
      this.field4039.method5469();
   }

   public boolean method5510() {
      return this.field4039.method5470();
   }

   public class168 method5511(int var1) {
      Iterator var3 = this.field4043.values().iterator();

      class168 var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (class168)var3.next();
      } while(var4.method2897() != var1);

      return var4;
   }

   public void method5512(int var1, int var2) {
      if (null != this.field4067 && this.field4067.method2893(var1, var2)) {
         this.field4042 = var1 - this.field4067.method2949() * 64;
         this.field4070 = var2 - this.field4067.method2905() * 64;
      }
   }

   public void method5513(int var1, int var2) {
      if (this.field4067 != null) {
         this.method5489(var1 - this.field4067.method2949() * 64, var2 - this.field4067.method2905() * 64, true);
         this.field4042 = -1;
         this.field4070 = -1;
      }
   }

   public void method5514(int var1, int var2, int var3) {
      if (this.field4067 != null) {
         int[] var5 = this.field4067.method2928(var1, var2, var3);
         if (null != var5) {
            this.method5512(var5[0], var5[1]);
         }

      }
   }

   public void method5540(int var1, int var2, int var3) {
      if (null != this.field4067) {
         int[] var5 = this.field4067.method2928(var1, var2, var3);
         if (null != var5) {
            this.method5513(var5[0], var5[1]);
         }

      }
   }

   public int method5516() {
      return this.field4067 == null ? -1 : this.field4030 + this.field4067.method2949() * 64;
   }

   public int method5561() {
      return null == this.field4067 ? -1 : this.field4025 + this.field4067.method2905() * 64;
   }

   public class245 method5518() {
      return null == this.field4067 ? null : this.field4067.method2895(this.method5516(), this.method5561());
   }

   public int method5519() {
      return this.field4046;
   }

   public int method5520() {
      return this.field4047;
   }

   public void method5521(int var1) {
      if (var1 >= 1) {
         this.field4050 = var1;
      }

   }

   public void method5569() {
      this.field4050 = 3;
   }

   public void method5522(int var1) {
      if (var1 >= 1) {
         this.field4051 = var1;
      }

   }

   public void method5523() {
      this.field4051 = 50;
   }

   public void method5524(boolean var1) {
      this.field4052 = var1;
   }

   public void method5525(int var1) {
      this.field4053 = new HashSet();
      this.field4053.add(var1);
      this.field4077 = 0;
      this.field4055 = 0;
   }

   public void method5526(int var1) {
      this.field4053 = new HashSet();
      this.field4077 = 0;
      this.field4055 = 0;

      for(int var3 = 0; var3 < class141.field1532; ++var3) {
         if (class73.method1770(var3) != null && class73.method1770(var3).field1553 == var1) {
            this.field4053.add(class73.method1770(var3).field1534);
         }
      }

   }

   public void method5671() {
      this.field4053 = null;
   }

   public void method5528(boolean var1) {
      this.field4068 = !var1;
   }

   public void method5641(int var1, boolean var2) {
      if (!var2) {
         this.field4064.add(var1);
      } else {
         this.field4064.remove(var1);
      }

      this.method5534();
   }

   public void method5530(int var1, boolean var2) {
      if (!var2) {
         this.field4065.add(var1);
      } else {
         this.field4065.remove(var1);
      }

      for(int var4 = 0; var4 < class141.field1532; ++var4) {
         if (class73.method1770(var4) != null && class73.method1770(var4).field1553 == var1) {
            int var5 = class73.method1770(var4).field1534;
            if (!var2) {
               this.field4048.add(var5);
            } else {
               this.field4048.remove(var5);
            }
         }
      }

      this.method5534();
   }

   public boolean method5506() {
      return !this.field4068;
   }

   public boolean method5532(int var1) {
      return !this.field4064.contains(var1);
   }

   public boolean method5608(int var1) {
      return !this.field4065.contains(var1);
   }

   void method5534() {
      this.field4023.clear();
      this.field4023.addAll(this.field4064);
      this.field4023.addAll(this.field4048);
   }

   public void method5496(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field4039.method5470()) {
         int var8 = (int)Math.ceil((double)((float)var3 / this.field4022));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field4022));
         List var10 = this.field4038.method3079(this.field4030 - var8 / 2 - 1, this.field4025 - var9 / 2 - 1, this.field4030 + var8 / 2 + 1, 1 + var9 / 2 + this.field4025, var1, var2, var3, var4, var5, var6);
         if (!var10.isEmpty()) {
            Iterator var11 = var10.iterator();

            boolean var14;
            do {
               if (!var11.hasNext()) {
                  return;
               }

               class186 var12 = (class186)var11.next();
               class141 var13 = class73.method1770(var12.method3208());
               var14 = false;

               for(int var15 = this.field4021.length - 1; var15 >= 0; --var15) {
                  if (var13.field1533[var15] != null) {
                     class8.method38(var13.field1533[var15], var13.field1543, this.field4021[var15], var12.method3208(), var12.field2111.method4161(), var12.field2110.method4161());
                     var14 = true;
                  }
               }
            } while(!var14);

         }
      }
   }

   public class245 method5536(int var1, class245 var2) {
      if (!this.field4039.method5470()) {
         return null;
      } else if (!this.field4038.method3097()) {
         return null;
      } else if (!this.field4067.method2893(var2.field2920, var2.field2922)) {
         return null;
      } else {
         HashMap var4 = this.field4038.method3095();
         List var5 = (List)var4.get(var1);
         if (null != var5 && !var5.isEmpty()) {
            class186 var6 = null;
            int var7 = -1;
            Iterator var8 = var5.iterator();

            while(true) {
               class186 var9;
               int var12;
               do {
                  if (!var8.hasNext()) {
                     return var6.field2110;
                  }

                  var9 = (class186)var8.next();
                  int var10 = var9.field2110.field2920 - var2.field2920;
                  int var11 = var9.field2110.field2922 - var2.field2922;
                  var12 = var10 * var10 + var11 * var11;
                  if (0 == var12) {
                     return var9.field2110;
                  }
               } while(var12 >= var7 && null != var6);

               var6 = var9;
               var7 = var12;
            }
         } else {
            return null;
         }
      }
   }

   public void method5537(int var1, int var2, class245 var3, class245 var4) {
      class68 var6 = new class68();
      class191 var7 = new class191(var2, var3, var4);
      var6.method1683(new Object[]{var7});
      switch(var1) {
      case 1008:
         var6.method1684(10);
         break;
      case 1009:
         var6.method1684(11);
         break;
      case 1010:
         var6.method1684(12);
         break;
      case 1011:
         var6.method1684(13);
         break;
      case 1012:
         var6.method1684(14);
      }

      class95.method2055(var6);
   }

   public class186 method5619() {
      if (!this.field4039.method5470()) {
         return null;
      } else if (!this.field4038.method3097()) {
         return null;
      } else {
         HashMap var2 = this.field4038.method3095();
         this.field4071 = new LinkedList();
         Iterator var3 = var2.values().iterator();

         while(var3.hasNext()) {
            List var4 = (List)var3.next();
            this.field4071.addAll(var4);
         }

         this.field4031 = this.field4071.iterator();
         return this.method5539();
      }
   }

   public class186 method5539() {
      if (null == this.field4031) {
         return null;
      } else {
         class186 var2;
         do {
            if (!this.field4031.hasNext()) {
               return null;
            }

            var2 = (class186)this.field4031.next();
         } while(var2.method3208() == -1);

         return var2;
      }
   }
}
