import java.util.Random;

public abstract class class303 extends class394 {
   public static class397[] field3741;
   static int field3735 = 0;
   static int field3737 = 256;
   static int field3743 = 0;
   static int field3744 = -1;
   static int field3745 = -1;
   static int field3746 = -1;
   static int field3749 = -1;
   static int field3750 = 0;
   static int field3751 = 0;
   static String[] field3753 = new String[100];
   static Random field3752 = new Random();
   byte[] field3742;
   byte[][] field3732 = new byte[256][];
   int[] field3733;
   int[] field3734;
   int[] field3736;
   int[] field3747;
   int[] field3748;
   public int field3738 = 0;
   public int field3739;
   public int field3740;

   class303(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.field3736 = var2;
      this.field3747 = var3;
      this.field3734 = var4;
      this.field3748 = var5;
      this.method4850(var1);
      this.field3732 = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if (this.field3747[var10] < var8 && this.field3748[var10] != 0) {
            var8 = this.field3747[var10];
         }

         if (this.field3747[var10] + this.field3748[var10] > var9) {
            var9 = this.field3747[var10] + this.field3748[var10];
         }
      }

      this.field3739 = this.field3738 - var8;
      this.field3740 = var9 - this.field3738;
   }

   class303(byte[] var1) {
      this.method4850(var1);
   }

   void method4850(byte[] var1) {
      this.field3733 = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.field3733.length; ++var2) {
            this.field3733[var2] = var1[var2] & 255;
         }

         this.field3738 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field3733[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.field3742 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if (var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this.field3742[(var13 << 8) + var8] = (byte)method4846(var11, var12, var4, this.field3733, var10, var13, var8);
                  }
               }
            }
         }

         this.field3738 = var4[32] + var10[32];
      }

   }

   static int method4846(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   int method4847(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.field3733[class274.method4376(var1) & 255];
   }

   public int method4848(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = class278.method4502(var7.substring(4));
                              var4 += field3741[var8].field4267;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if (var6 == 160) {
                  var6 = ' ';
               }

               if (var2 == -1) {
                  var4 += this.field3733[(char)(class274.method4376(var6) & 255)];
                  if (this.field3742 != null && var3 != -1) {
                     var4 += this.field3742[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   public int method4867(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.method4847('<');
                     if (this.field3742 != null && var11 != -1) {
                        var4 += this.field3742[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.method4847('>');
                     if (this.field3742 != null && var11 != -1) {
                        var4 += this.field3742[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = class278.method4502(var16.substring(4));
                        var4 += field3741[var17].field4267;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.method4847(var15);
                     if (this.field3742 != null && var11 != -1) {
                        var4 += this.field3742[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if (var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   public int method4902(String var1, int var2) {
      int var3 = this.method4867(var1, new int[]{var2}, field3753);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method4848(field3753[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public int method4882(String var1, int var2) {
      return this.method4867(var1, new int[]{var2}, field3753);
   }

   public static String escapeBrackets(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   public void method4853(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method4862(var4, var5);
         this.method4911(var1, var2, var3);
      }
   }

   public void method4865(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method4862(var4, var5);
         field3737 = var6;
         this.method4911(var1, var2, var3);
      }
   }

   public void method4921(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method4862(var4, var5);
         this.method4911(var1, var2 - this.method4848(var1), var3);
      }
   }

   public void method4922(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method4862(var4, var5);
         this.method4911(var1, var2 - this.method4848(var1) / 2, var3);
      }
   }

   public int method4857(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (var1 == null) {
         return 0;
      } else {
         this.method4862(var6, var7);
         if (var10 == 0) {
            var10 = this.field3738;
         }

         int[] var11 = new int[]{var4};
         if (var5 < this.field3739 + this.field3740 + var10 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method4867(var1, var11, field3753);
         if (var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if (var9 == 0) {
            var13 = var3 + this.field3739;
         } else if (var9 == 1) {
            var13 = var3 + this.field3739 + (var5 - this.field3739 - this.field3740 - (var12 - 1) * var10) / 2;
         } else if (var9 == 2) {
            var13 = var3 + var5 - this.field3740 - (var12 - 1) * var10;
         } else {
            var14 = (var5 - this.field3739 - this.field3740 - (var12 - 1) * var10) / (var12 + 1);
            if (var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + this.field3739 + var14;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if (var8 == 0) {
               this.method4911(field3753[var14], var2, var13);
            } else if (var8 == 1) {
               this.method4911(field3753[var14], var2 + (var4 - this.method4848(field3753[var14])) / 2, var13);
            } else if (var8 == 2) {
               this.method4911(field3753[var14], var2 + var4 - this.method4848(field3753[var14]), var13);
            } else if (var14 == var12 - 1) {
               this.method4911(field3753[var14], var2, var13);
            } else {
               this.method4864(field3753[var14], var4);
               this.method4911(field3753[var14], var2, var13);
               field3750 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   public void method4858(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method4862(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method4866(var1, var2 - this.method4848(var1) / 2, var3, (int[])null, var7);
      }
   }

   public void method4873(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method4862(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method4866(var1, var2 - this.method4848(var1) / 2, var3, var7, var8);
      }
   }

   public void method4860(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 != null) {
         this.method4862(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if (var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method4866(var1, var2 - this.method4848(var1) / 2, var3, (int[])null, var10);
      }
   }

   public void method4861(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method4862(var4, var5);
         field3752.setSeed((long)var6);
         field3737 = 192 + (field3752.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((field3752.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method4866(var1, var2, var3, var7, (int[])null);
      }
   }

   void method4862(int var1, int var2) {
      field3744 = -1;
      field3749 = -1;
      field3745 = var2;
      field3746 = var2;
      field3735 = var1;
      field3743 = var1;
      field3737 = 256;
      field3750 = 0;
      field3751 = 0;
   }

   void method4863(String var1) {
      try {
         if (var1.startsWith("col=")) {
            field3743 = class126.method2250(var1.substring(4), 16);
         } else if (var1.equals("/col")) {
            field3743 = field3735;
         } else {
            int var2;
            String var3;
            if (var1.startsWith("str=")) {
               var3 = var1.substring(4);
               var2 = class44.method772(var3, 16, true);
               field3744 = var2;
            } else if (var1.equals("str")) {
               field3744 = 8388608;
            } else if (var1.equals("/str")) {
               field3744 = -1;
            } else if (var1.startsWith("u=")) {
               field3749 = class126.method2250(var1.substring(2), 16);
            } else if (var1.equals("u")) {
               field3749 = 0;
            } else if (var1.equals("/u")) {
               field3749 = -1;
            } else if (var1.startsWith("shad=")) {
               var3 = var1.substring(5);
               var2 = class44.method772(var3, 16, true);
               field3746 = var2;
            } else if (var1.equals("shad")) {
               field3746 = 0;
            } else if (var1.equals("/shad")) {
               field3746 = field3745;
            } else if (var1.equals("br")) {
               this.method4862(field3735, field3745);
            }
         }
      } catch (Exception var4) {
      }

   }

   void method4864(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         field3750 = (var2 - this.method4848(var1) << 8) / var3;
      }

   }

   void method4911(String var1, int var2, int var3) {
      var3 -= this.field3738;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(class274.method4376(var1.charAt(var6)) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               int var9;
               if (var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              var9 = class278.method4502(var8.substring(4));
                              class397 var13 = field3741[var9];
                              var13.method6349(var2, var3 + this.field3738 - var13.field4268);
                              var2 += var13.field4267;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.method4863(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.field3742 != null && var5 != -1) {
                     var2 += this.field3742[(var5 << 8) + var7];
                  }

                  int var12 = this.field3734[var7];
                  var9 = this.field3748[var7];
                  if (var7 != ' ') {
                     if (field3737 == 256) {
                        if (field3746 != -1) {
                           method4868(this.field3732[var7], var2 + this.field3736[var7] + 1, var3 + this.field3747[var7] + 1, var12, var9, field3746);
                        }

                        this.method4874(this.field3732[var7], var2 + this.field3736[var7], var3 + this.field3747[var7], var12, var9, field3743);
                     } else {
                        if (field3746 != -1) {
                           method4941(this.field3732[var7], var2 + this.field3736[var7] + 1, var3 + this.field3747[var7] + 1, var12, var9, field3746, field3737);
                        }

                        this.method4845(this.field3732[var7], var2 + this.field3736[var7], var3 + this.field3747[var7], var12, var9, field3743, field3737);
                     }
                  } else if (field3750 > 0) {
                     field3751 += field3750;
                     var2 += field3751 >> 8;
                     field3751 &= 255;
                  }

                  int var10 = this.field3733[var7];
                  if (field3744 != -1) {
                     method6271(var2, var3 + (int)((double)this.field3738 * 0.7D), var10, field3744);
                  }

                  if (field3749 != -1) {
                     method6271(var2, var3 + this.field3738 + 1, var10, field3749);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   void method4866(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field3738;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if (var1.charAt(var9) != 0) {
            char var10 = (char)(class274.method4376(var1.charAt(var9)) & 255);
            if (var10 == '<') {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if (var10 == '>' && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if (var11.equals("lt")) {
                     var10 = '<';
                  } else {
                     if (!var11.equals("gt")) {
                        if (var11.startsWith("img=")) {
                           try {
                              if (var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if (var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = class278.method4502(var11.substring(4));
                              class397 var18 = field3741[var14];
                              var18.method6349(var2 + var12, var3 + this.field3738 - var18.field4268 + var13);
                              var2 += var18.field4267;
                              var7 = -1;
                           } catch (Exception var16) {
                           }
                        } else {
                           this.method4863(var11);
                        }
                        continue;
                     }

                     var10 = '>';
                  }
               }

               if (var10 == 160) {
                  var10 = ' ';
               }

               if (var6 == -1) {
                  if (this.field3742 != null && var7 != -1) {
                     var2 += this.field3742[(var7 << 8) + var10];
                  }

                  int var17 = this.field3734[var10];
                  var12 = this.field3748[var10];
                  if (var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if (var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if (var10 != ' ') {
                     if (field3737 == 256) {
                        if (field3746 != -1) {
                           method4868(this.field3732[var10], var2 + this.field3736[var10] + 1 + var13, var3 + this.field3747[var10] + 1 + var14, var17, var12, field3746);
                        }

                        this.method4874(this.field3732[var10], var2 + this.field3736[var10] + var13, var3 + this.field3747[var10] + var14, var17, var12, field3743);
                     } else {
                        if (field3746 != -1) {
                           method4941(this.field3732[var10], var2 + this.field3736[var10] + 1 + var13, var3 + this.field3747[var10] + 1 + var14, var17, var12, field3746, field3737);
                        }

                        this.method4845(this.field3732[var10], var2 + this.field3736[var10] + var13, var3 + this.field3747[var10] + var14, var17, var12, field3743, field3737);
                     }
                  } else if (field3750 > 0) {
                     field3751 += field3750;
                     var2 += field3751 >> 8;
                     field3751 &= 255;
                  }

                  int var15 = this.field3733[var10];
                  if (field3744 != -1) {
                     method6271(var2, var3 + (int)((double)this.field3738 * 0.7D), var15, field3744);
                  }

                  if (field3749 != -1) {
                     method6271(var2, var3 + this.field3738, var15, field3749);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   static void method4868(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * class394.field4245;
      int var7 = class394.field4245 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < class394.field4247) {
         var10 = class394.field4247 - var2;
         var4 -= var10;
         var2 = class394.field4247;
         var9 += var10 * var3;
         var6 += var10 * class394.field4245;
      }

      if (var2 + var4 > class394.field4244) {
         var4 -= var2 + var4 - class394.field4244;
      }

      if (var1 < class394.field4249) {
         var10 = class394.field4249 - var1;
         var3 -= var10;
         var1 = class394.field4249;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var1 + var3 > class394.field4248) {
         var10 = var1 + var3 - class394.field4248;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         method4869(class394.field4250, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   static void method4869(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method4941(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * class394.field4245;
      int var8 = class394.field4245 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < class394.field4247) {
         var11 = class394.field4247 - var2;
         var4 -= var11;
         var2 = class394.field4247;
         var10 += var11 * var3;
         var7 += var11 * class394.field4245;
      }

      if (var2 + var4 > class394.field4244) {
         var4 -= var2 + var4 - class394.field4244;
      }

      if (var1 < class394.field4249) {
         var11 = class394.field4249 - var1;
         var3 -= var11;
         var1 = class394.field4249;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > class394.field4248) {
         var11 = var1 + var3 - class394.field4248;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         method4871(class394.field4250, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   static void method4871(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   abstract void method4845(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   abstract void method4874(byte[] var1, int var2, int var3, int var4, int var5, int var6);
}
