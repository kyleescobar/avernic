public class class236 extends class31 {
   static class397 field2847;
   boolean field2846;
   class237 field2845 = new class237();
   class239 field2850 = new class239(this);
   class241[][] field2843 = new class241[16][128];
   class241[][] field2844 = new class241[16][128];
   class364 field2828 = new class364(128);
   int field2825 = 1000000;
   int field2827 = 256;
   int field2837;
   int field2848;
   int[] field2824 = new int[16];
   int[] field2826 = new int[16];
   int[] field2829 = new int[16];
   int[] field2830 = new int[16];
   int[] field2831 = new int[16];
   int[] field2832 = new int[16];
   int[] field2833 = new int[16];
   int[] field2834 = new int[16];
   int[] field2835 = new int[16];
   int[] field2838 = new int[16];
   int[] field2839 = new int[16];
   int[] field2840 = new int[16];
   int[] field2841 = new int[16];
   int[] field2842 = new int[16];
   int[] field2852 = new int[16];
   long field2849;
   long field2851;

   public class236() {
      this.method3983();
   }

   public synchronized void method3966(int var1) {
      this.field2827 = var1;
   }

   public int method3967() {
      return this.field2827;
   }

   synchronized boolean method3968(class240 var1, class277 var2, class28 var3, int var4) {
      var1.method4131();
      boolean var6 = true;
      int[] var7 = null;
      if (var4 > 0) {
         var7 = new int[]{var4};
      }

      for(class351 var8 = (class351)var1.field2882.method5736(); var8 != null; var8 = (class351)var1.field2882.method5739()) {
         int var9 = (int)var8.field3966;
         class238 var10 = (class238)this.field2828.get((long)var9);
         if (var10 == null) {
            var10 = class84.method1926(var2, var9);
            if (null == var10) {
               var6 = false;
               continue;
            }

            this.field2828.put(var10, (long)var9);
         }

         if (!var10.method4111(var3, var8.field3962, var7)) {
            var6 = false;
         }
      }

      if (var6) {
         var1.method4128();
      }

      return var6;
   }

   synchronized void method4010() {
      for(class238 var2 = (class238)this.field2828.method5736(); null != var2; var2 = (class238)this.field2828.method5739()) {
         var2.method4110();
      }

   }

   public synchronized void method3970() {
      for(class238 var2 = (class238)this.field2828.method5736(); null != var2; var2 = (class238)this.field2828.method5739()) {
         var2.remove();
      }

   }

   synchronized void method3971(class240 var1, boolean var2) {
      this.method3972();
      this.field2845.method4057(var1.field2881);
      this.field2846 = var2;
      this.field2849 = 0L;
      int var4 = this.field2845.method4060();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field2845.method4069(var5);
         this.field2845.method4064(var5);
         this.field2845.method4062(var5);
      }

      this.field2837 = this.field2845.method4079();
      this.field2848 = this.field2845.field2857[this.field2837];
      this.field2851 = this.field2845.method4066(this.field2848);
   }

   public synchronized void method3972() {
      this.field2845.method4058();
      this.method3983();
   }

   public synchronized boolean method3975() {
      return this.field2845.method4107();
   }

   public synchronized void method3973(int var1, int var2) {
      this.method3974(var1, var2);
   }

   void method3974(int var1, int var2) {
      this.field2824[var1] = var2;
      this.field2832[var1] = var2 & -128;
      this.method3997(var1, var2);
   }

   void method3997(int var1, int var2) {
      if (this.field2830[var1] != var2) {
         this.field2830[var1] = var2;

         for(int var4 = 0; var4 < 128; ++var4) {
            this.field2844[var1][var4] = null;
         }
      }

   }

   void method4015(int var1, int var2, int var3) {
      this.method3977(var1, var2, 64);
      if ((this.field2831[var1] & 2) != 0) {
         for(class241 var5 = (class241)this.field2850.field2877.method4694(); null != var5; var5 = (class241)this.field2850.field2877.method4679()) {
            if (var5.field2903 == var1 && var5.field2897 < 0) {
               this.field2843[var1][var5.field2894] = null;
               this.field2843[var1][var2] = var5;
               int var6 = (var5.field2893 * var5.field2892 >> 12) + var5.field2883;
               var5.field2883 += var2 - var5.field2894 << 8;
               var5.field2892 = var6 - var5.field2883;
               var5.field2893 = 4096;
               var5.field2894 = var2;
               return;
            }
         }
      }

      class238 var9 = (class238)this.field2828.get((long)this.field2830[var1]);
      if (null != var9) {
         class23 var10 = var9.field2870[var2];
         if (var10 != null) {
            class241 var7 = new class241();
            var7.field2903 = var1;
            var7.field2891 = var9;
            var7.field2885 = var10;
            var7.field2886 = var9.field2872[var2];
            var7.field2888 = var9.field2873[var2];
            var7.field2894 = var2;
            var7.field2889 = var9.field2871 * var3 * var3 * var9.field2874[var2] + 1024 >> 11;
            var7.field2890 = var9.field2868[var2] & 255;
            var7.field2883 = (var2 << 8) - (var9.field2869[var2] & 32767);
            var7.field2884 = 0;
            var7.field2900 = 0;
            var7.field2896 = 0;
            var7.field2897 = -1;
            var7.field2898 = 0;
            if (0 == this.field2840[var1]) {
               var7.field2901 = class30.method493(var10, this.method4051(var7), this.method3989(var7), this.method3990(var7));
            } else {
               var7.field2901 = class30.method493(var10, this.method4051(var7), 0, this.method3990(var7));
               this.method3965(var7, var9.field2869[var2] < 0);
            }

            if (var9.field2869[var2] < 0) {
               var7.field2901.method566(-1);
            }

            if (var7.field2888 >= 0) {
               class241 var8 = this.field2844[var1][var7.field2888];
               if (var8 != null && var8.field2897 < 0) {
                  this.field2843[var1][var8.field2894] = null;
                  var8.field2897 = 0;
               }

               this.field2844[var1][var7.field2888] = var7;
            }

            this.field2850.field2877.method4672(var7);
            this.field2843[var1][var2] = var7;
         }
      }
   }

   void method3965(class241 var1, boolean var2) {
      int var4 = var1.field2885.field165.length;
      int var5;
      if (var2 && var1.field2885.field168) {
         int var6 = var4 + var4 - var1.field2885.field166;
         var5 = (int)((long)this.field2840[var1.field2903] * (long)var6 >> 6);
         var4 <<= 8;
         if (var5 >= var4) {
            var5 = var4 + var4 - 1 - var5;
            var1.field2901.method502(true);
         }
      } else {
         var5 = (int)((long)this.field2840[var1.field2903] * (long)var4 >> 6);
      }

      var1.field2901.method501(var5);
   }

   void method3977(int var1, int var2, int var3) {
      class241 var5 = this.field2843[var1][var2];
      if (var5 != null) {
         this.field2843[var1][var2] = null;
         if ((this.field2831[var1] & 2) != 0) {
            for(class241 var6 = (class241)this.field2850.field2877.method4687(); null != var6; var6 = (class241)this.field2850.field2877.method4678()) {
               if (var5.field2903 == var6.field2903 && var6.field2897 < 0 && var6 != var5) {
                  var5.field2897 = 0;
                  break;
               }
            }
         } else {
            var5.field2897 = 0;
         }

      }
   }

   void method3978(int var1, int var2, int var3) {
   }

   void method3979(int var1, int var2) {
   }

   void method3980(int var1, int var2) {
      this.field2833[var1] = var2;
   }

   void method3981(int var1) {
      for(class241 var3 = (class241)this.field2850.field2877.method4687(); null != var3; var3 = (class241)this.field2850.field2877.method4678()) {
         if (var1 < 0 || var3.field2903 == var1) {
            if (var3.field2901 != null) {
               var3.field2901.method506(class282.field3634 / 100);
               if (var3.field2901.method510()) {
                  this.field2850.field2878.method329(var3.field2901);
               }

               var3.method4145();
            }

            if (var3.field2897 < 0) {
               this.field2843[var3.field2903][var3.field2894] = null;
            }

            var3.remove();
         }
      }

   }

   void method3982(int var1) {
      if (var1 >= 0) {
         this.field2852[var1] = 12800;
         this.field2826[var1] = 8192;
         this.field2829[var1] = 16383;
         this.field2833[var1] = 8192;
         this.field2834[var1] = 0;
         this.field2835[var1] = 8192;
         this.method3984(var1);
         this.method4042(var1);
         this.field2831[var1] = 0;
         this.field2838[var1] = 32767;
         this.field2839[var1] = 256;
         this.field2840[var1] = 0;
         this.method3987(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method3982(var1);
         }

      }
   }

   void method3991(int var1) {
      for(class241 var3 = (class241)this.field2850.field2877.method4687(); var3 != null; var3 = (class241)this.field2850.field2877.method4678()) {
         if ((var1 < 0 || var1 == var3.field2903) && var3.field2897 < 0) {
            this.field2843[var3.field2903][var3.field2894] = null;
            var3.field2897 = 0;
         }
      }

   }

   void method3983() {
      this.method3981(-1);
      this.method3982(-1);

      int var2;
      for(var2 = 0; var2 < 16; ++var2) {
         this.field2830[var2] = this.field2824[var2];
      }

      for(var2 = 0; var2 < 16; ++var2) {
         this.field2832[var2] = this.field2824[var2] & -128;
      }

   }

   void method3984(int var1) {
      if ((this.field2831[var1] & 2) != 0) {
         for(class241 var3 = (class241)this.field2850.field2877.method4687(); var3 != null; var3 = (class241)this.field2850.field2877.method4678()) {
            if (var1 == var3.field2903 && null == this.field2843[var1][var3.field2894] && var3.field2897 < 0) {
               var3.field2897 = 0;
            }
         }
      }

   }

   void method4042(int var1) {
      if (0 != (this.field2831[var1] & 4)) {
         for(class241 var3 = (class241)this.field2850.field2877.method4687(); var3 != null; var3 = (class241)this.field2850.field2877.method4678()) {
            if (var3.field2903 == var1) {
               var3.field2899 = 0;
            }
         }
      }

   }

   void method3986(int var1) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if (var3 == 128) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method3977(var4, var5, var6);
      } else if (144 == var3) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var6 > 0) {
            this.method4015(var4, var5, var6);
         } else {
            this.method3977(var4, var5, 64);
         }

      } else if (var3 == 160) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method3978(var4, var5, var6);
      } else if (var3 == 176) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (0 == var5) {
            this.field2832[var4] = (this.field2832[var4] & -2080769) + (var6 << 14);
         }

         if (32 == var5) {
            this.field2832[var4] = (var6 << 7) + (this.field2832[var4] & -16257);
         }

         if (var5 == 1) {
            this.field2834[var4] = (var6 << 7) + (this.field2834[var4] & -16257);
         }

         if (33 == var5) {
            this.field2834[var4] = (this.field2834[var4] & -128) + var6;
         }

         if (var5 == 5) {
            this.field2835[var4] = (this.field2835[var4] & -16257) + (var6 << 7);
         }

         if (37 == var5) {
            this.field2835[var4] = (this.field2835[var4] & -128) + var6;
         }

         if (var5 == 7) {
            this.field2852[var4] = (var6 << 7) + (this.field2852[var4] & -16257);
         }

         if (var5 == 39) {
            this.field2852[var4] = (this.field2852[var4] & -128) + var6;
         }

         if (10 == var5) {
            this.field2826[var4] = (this.field2826[var4] & -16257) + (var6 << 7);
         }

         if (42 == var5) {
            this.field2826[var4] = (this.field2826[var4] & -128) + var6;
         }

         if (var5 == 11) {
            this.field2829[var4] = (this.field2829[var4] & -16257) + (var6 << 7);
         }

         if (43 == var5) {
            this.field2829[var4] = (this.field2829[var4] & -128) + var6;
         }

         int[] var10000;
         if (var5 == 64) {
            if (var6 >= 64) {
               var10000 = this.field2831;
               var10000[var4] |= 1;
            } else {
               var10000 = this.field2831;
               var10000[var4] &= -2;
            }
         }

         if (var5 == 65) {
            if (var6 >= 64) {
               var10000 = this.field2831;
               var10000[var4] |= 2;
            } else {
               this.method3984(var4);
               var10000 = this.field2831;
               var10000[var4] &= -3;
            }
         }

         if (99 == var5) {
            this.field2838[var4] = (var6 << 7) + (this.field2838[var4] & 127);
         }

         if (var5 == 98) {
            this.field2838[var4] = (this.field2838[var4] & 16256) + var6;
         }

         if (var5 == 101) {
            this.field2838[var4] = (var6 << 7) + (this.field2838[var4] & 127) + 16384;
         }

         if (100 == var5) {
            this.field2838[var4] = var6 + 16384 + (this.field2838[var4] & 16256);
         }

         if (120 == var5) {
            this.method3981(var4);
         }

         if (var5 == 121) {
            this.method3982(var4);
         }

         if (123 == var5) {
            this.method3991(var4);
         }

         int var7;
         if (var5 == 6) {
            var7 = this.field2838[var4];
            if (var7 == 16384) {
               this.field2839[var4] = (var6 << 7) + (this.field2839[var4] & -16257);
            }
         }

         if (38 == var5) {
            var7 = this.field2838[var4];
            if (16384 == var7) {
               this.field2839[var4] = var6 + (this.field2839[var4] & -128);
            }
         }

         if (16 == var5) {
            this.field2840[var4] = (var6 << 7) + (this.field2840[var4] & -16257);
         }

         if (48 == var5) {
            this.field2840[var4] = var6 + (this.field2840[var4] & -128);
         }

         if (81 == var5) {
            if (var6 >= 64) {
               var10000 = this.field2831;
               var10000[var4] |= 4;
            } else {
               this.method4042(var4);
               var10000 = this.field2831;
               var10000[var4] &= -5;
            }
         }

         if (var5 == 17) {
            this.method3987(var4, (this.field2841[var4] & -16257) + (var6 << 7));
         }

         if (49 == var5) {
            this.method3987(var4, var6 + (this.field2841[var4] & -128));
         }

      } else if (var3 == 192) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method3997(var4, this.field2832[var4] + var5);
      } else if (var3 == 208) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method3979(var4, var5);
      } else if (224 == var3) {
         var4 = var1 & 15;
         var5 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
         this.method3980(var4, var5);
      } else {
         var3 = var1 & 255;
         if (255 == var3) {
            this.method3983();
         }
      }
   }

   void method3987(int var1, int var2) {
      this.field2841[var1] = var2;
      this.field2842[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
   }

   int method4051(class241 var1) {
      int var3 = (var1.field2893 * var1.field2892 >> 12) + var1.field2883;
      var3 += this.field2839[var1.field2903] * (this.field2833[var1.field2903] - 8192) >> 12;
      class234 var4 = var1.field2886;
      int var5;
      if (var4.field2811 > 0 && (var4.field2805 > 0 || this.field2834[var1.field2903] > 0)) {
         var5 = var4.field2805 << 2;
         int var6 = var4.field2813 << 1;
         if (var1.field2887 < var6) {
            var5 = var1.field2887 * var5 / var6;
         }

         var5 += this.field2834[var1.field2903] >> 7;
         double var7 = Math.sin(0.01227184630308513D * (double)(var1.field2895 & 511));
         var3 += (int)(var7 * (double)var5);
      }

      var5 = (int)((double)(var1.field2885.field164 * 256) * Math.pow(2.0D, (double)var3 * 3.255208333333333E-4D) / (double)class282.field3634 + 0.5D);
      return var5 < 1 ? 1 : var5;
   }

   int method3989(class241 var1) {
      class234 var3 = var1.field2886;
      int var4 = this.field2852[var1.field2903] * this.field2829[var1.field2903] + 4096 >> 13;
      var4 = 16384 + var4 * var4 >> 15;
      var4 = 16384 + var1.field2889 * var4 >> 15;
      var4 = var4 * this.field2827 + 128 >> 8;
      if (var3.field2807 > 0) {
         var4 = (int)((double)var4 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field2884 * (double)var3.field2807) + 0.5D);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      if (var3.field2809 != null) {
         var5 = var1.field2900;
         var6 = var3.field2809[var1.field2896 + 1];
         if (var1.field2896 < var3.field2809.length - 2) {
            var7 = (var3.field2809[var1.field2896] & 255) << 8;
            var8 = (var3.field2809[var1.field2896 + 2] & 255) << 8;
            var6 += (var5 - var7) * (var3.field2809[3 + var1.field2896] - var6) / (var8 - var7);
         }

         var4 = 32 + var6 * var4 >> 6;
      }

      if (var1.field2897 > 0 && var3.field2812 != null) {
         var5 = var1.field2897;
         var6 = var3.field2812[1 + var1.field2898];
         if (var1.field2898 < var3.field2812.length - 2) {
            var7 = (var3.field2812[var1.field2898] & 255) << 8;
            var8 = (var3.field2812[2 + var1.field2898] & 255) << 8;
            var6 += (var3.field2812[var1.field2898 + 3] - var6) * (var5 - var7) / (var8 - var7);
         }

         var4 = 32 + var4 * var6 >> 6;
      }

      return var4;
   }

   int method3990(class241 var1) {
      int var3 = this.field2826[var1.field2903];
      return var3 < 8192 ? var1.field2890 * var3 + 32 >> 6 : 16384 - ((16384 - var3) * (128 - var1.field2890) + 32 >> 6);
   }

   protected synchronized class31 method643() {
      return this.field2850;
   }

   protected synchronized class31 method631() {
      return null;
   }

   protected synchronized int method632() {
      return 0;
   }

   protected synchronized void method641(int[] var1, int var2, int var3) {
      if (this.field2845.method4107()) {
         int var4 = this.field2825 * this.field2845.field2854 / class282.field3634;

         do {
            long var5 = (long)var4 * (long)var3 + this.field2849;
            if (this.field2851 - var5 >= 0L) {
               this.field2849 = var5;
               break;
            }

            int var7 = (int)((this.field2851 - this.field2849 + (long)var4 - 1L) / (long)var4);
            this.field2849 += (long)var7 * (long)var4;
            this.field2850.method641(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method3992();
         } while(this.field2845.method4107());
      }

      this.field2850.method641(var1, var2, var3);
   }

   protected synchronized void method635(int var1) {
      if (this.field2845.method4107()) {
         int var2 = this.field2845.field2854 * this.field2825 / class282.field3634;

         do {
            long var3 = this.field2849 + (long)var2 * (long)var1;
            if (this.field2851 - var3 >= 0L) {
               this.field2849 = var3;
               break;
            }

            int var5 = (int)((this.field2851 - this.field2849 + (long)var2 - 1L) / (long)var2);
            this.field2849 += (long)var2 * (long)var5;
            this.field2850.method635(var5);
            var1 -= var5;
            this.method3992();
         } while(this.field2845.method4107());
      }

      this.field2850.method635(var1);
   }

   void method3992() {
      int var2 = this.field2837;
      int var3 = this.field2848;

      long var4;
      for(var4 = this.field2851; this.field2848 == var3; var4 = this.field2845.method4066(var3)) {
         while(var3 == this.field2845.field2857[var2]) {
            this.field2845.method4069(var2);
            int var6 = this.field2845.method4065(var2);
            if (1 == var6) {
               this.field2845.method4082();
               this.field2845.method4062(var2);
               if (this.field2845.method4106()) {
                  if (!this.field2846 || 0 == var3) {
                     this.method3983();
                     this.field2845.method4058();
                     return;
                  }

                  this.field2845.method4071(var4);
               }
               break;
            }

            if ((var6 & 128) != 0) {
               this.method3986(var6);
            }

            this.field2845.method4064(var2);
            this.field2845.method4062(var2);
         }

         var2 = this.field2845.method4079();
         var3 = this.field2845.field2857[var2];
      }

      this.field2837 = var2;
      this.field2848 = var3;
      this.field2851 = var4;
   }

   boolean method3993(class241 var1) {
      if (null == var1.field2901) {
         if (var1.field2897 >= 0) {
            var1.remove();
            if (var1.field2888 > 0 && this.field2844[var1.field2903][var1.field2888] == var1) {
               this.field2844[var1.field2903][var1.field2888] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean method3994(class241 var1, int[] var2, int var3, int var4) {
      var1.field2902 = class282.field3634 / 100;
      if (var1.field2897 < 0 || var1.field2901 != null && !var1.field2901.method549()) {
         int var6 = var1.field2893;
         if (var6 > 0) {
            var6 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2835[var1.field2903]) + 0.5D);
            if (var6 < 0) {
               var6 = 0;
            }

            var1.field2893 = var6;
         }

         var1.field2901.method507(this.method4051(var1));
         class234 var7 = var1.field2886;
         boolean var8 = false;
         ++var1.field2887;
         var1.field2895 += var7.field2811;
         double var9 = (double)((var1.field2892 * var1.field2893 >> 12) + (var1.field2894 - 60 << 8)) * 5.086263020833333E-6D;
         if (var7.field2807 > 0) {
            if (var7.field2810 > 0) {
               var1.field2884 += (int)(128.0D * Math.pow(2.0D, (double)var7.field2810 * var9) + 0.5D);
            } else {
               var1.field2884 += 128;
            }
         }

         if (var7.field2809 != null) {
            if (var7.field2808 > 0) {
               var1.field2900 += (int)(128.0D * Math.pow(2.0D, (double)var7.field2808 * var9) + 0.5D);
            } else {
               var1.field2900 += 128;
            }

            while(var1.field2896 < var7.field2809.length - 2 && var1.field2900 > (var7.field2809[2 + var1.field2896] & 255) << 8) {
               var1.field2896 += 2;
            }

            if (var7.field2809.length - 2 == var1.field2896 && 0 == var7.field2809[var1.field2896 + 1]) {
               var8 = true;
            }
         }

         if (var1.field2897 >= 0 && null != var7.field2812 && 0 == (this.field2831[var1.field2903] & 1) && (var1.field2888 < 0 || this.field2844[var1.field2903][var1.field2888] != var1)) {
            if (var7.field2806 > 0) {
               var1.field2897 += (int)(128.0D * Math.pow(2.0D, (double)var7.field2806 * var9) + 0.5D);
            } else {
               var1.field2897 += 128;
            }

            while(var1.field2898 < var7.field2812.length - 2 && var1.field2897 > (var7.field2812[2 + var1.field2898] & 255) << 8) {
               var1.field2898 += 2;
            }

            if (var7.field2812.length - 2 == var1.field2898) {
               var8 = true;
            }
         }

         if (var8) {
            var1.field2901.method506(var1.field2902);
            if (var2 != null) {
               var1.field2901.method641(var2, var3, var4);
            } else {
               var1.field2901.method635(var4);
            }

            if (var1.field2901.method510()) {
               this.field2850.field2878.method329(var1.field2901);
            }

            var1.method4145();
            if (var1.field2897 >= 0) {
               var1.remove();
               if (var1.field2888 > 0 && this.field2844[var1.field2903][var1.field2888] == var1) {
                  this.field2844[var1.field2903][var1.field2888] = null;
               }
            }

            return true;
         } else {
            var1.field2901.method505(var1.field2902, this.method3989(var1), this.method3990(var1));
            return false;
         }
      } else {
         var1.method4145();
         var1.remove();
         if (var1.field2888 > 0 && var1 == this.field2844[var1.field2903][var1.field2888]) {
            this.field2844[var1.field2903][var1.field2888] = null;
         }

         return true;
      }
   }
}
