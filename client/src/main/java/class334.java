import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

public final class class334 {
   static byte[] field3901 = new byte[520];
   static ScheduledExecutorService field3903;
   class370 field3899 = null;
   class370 field3900 = null;
   int field3898 = 65000;
   int field3902;

   public class334(int var1, class370 var2, class370 var3, int var4) {
      this.field3902 = var1;
      this.field3899 = var2;
      this.field3900 = var3;
      this.field3898 = var4;
   }

   public byte[] method5347(int var1) {
      synchronized(this.field3899) {
         try {
            Object var10000;
            if (this.field3900.method5813() < (long)(6 + var1 * 6)) {
               var10000 = null;
               return (byte[])var10000;
            } else {
               this.field3900.method5795((long)(6 * var1));
               this.field3900.method5811(field3901, 0, 6);
               int var4 = (field3901[2] & 255) + ((field3901[1] & 255) << 8) + ((field3901[0] & 255) << 16);
               int var5 = (field3901[5] & 255) + ((field3901[3] & 255) << 16) + ((field3901[4] & 255) << 8);
               if (var4 < 0 || var4 > this.field3898) {
                  var10000 = null;
                  return (byte[])var10000;
               } else if (var5 <= 0 || (long)var5 > this.field3899.method5813() / 520L) {
                  var10000 = null;
                  return (byte[])var10000;
               } else {
                  byte[] var6 = new byte[var4];
                  int var7 = 0;

                  for(int var8 = 0; var7 < var4; ++var8) {
                     if (0 == var5) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     this.field3899.method5795(520L * (long)var5);
                     int var9 = var4 - var7;
                     int var10;
                     int var11;
                     int var12;
                     int var13;
                     byte var14;
                     if (var1 > 65535) {
                        if (var9 > 510) {
                           var9 = 510;
                        }

                        var14 = 10;
                        this.field3899.method5811(field3901, 0, var14 + var9);
                        var10 = (field3901[3] & 255) + ((field3901[2] & 255) << 8) + ((field3901[1] & 255) << 16) + ((field3901[0] & 255) << 24);
                        var11 = ((field3901[4] & 255) << 8) + (field3901[5] & 255);
                        var12 = (field3901[8] & 255) + ((field3901[6] & 255) << 16) + ((field3901[7] & 255) << 8);
                        var13 = field3901[9] & 255;
                     } else {
                        if (var9 > 512) {
                           var9 = 512;
                        }

                        var14 = 8;
                        this.field3899.method5811(field3901, 0, var14 + var9);
                        var10 = ((field3901[0] & 255) << 8) + (field3901[1] & 255);
                        var11 = (field3901[3] & 255) + ((field3901[2] & 255) << 8);
                        var12 = ((field3901[5] & 255) << 8) + ((field3901[4] & 255) << 16) + (field3901[6] & 255);
                        var13 = field3901[7] & 255;
                     }

                     if (var10 != var1 || var11 != var8 || var13 != this.field3902) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     if (var12 < 0 || (long)var12 > this.field3899.method5813() / 520L) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     int var15 = var14 + var9;

                     for(int var16 = var14; var16 < var15; ++var16) {
                        var6[var7++] = field3901[var16];
                     }

                     var5 = var12;
                  }

                  byte[] var20 = var6;
                  return var20;
               }
            }
         } catch (IOException var18) {
            return null;
         }
      }
   }

   public boolean method5353(int var1, byte[] var2, int var3) {
      synchronized(this.field3899) {
         if (var3 >= 0 && var3 <= this.field3898) {
            boolean var6 = this.method5349(var1, var2, var3, true);
            if (!var6) {
               var6 = this.method5349(var1, var2, var3, false);
            }

            return var6;
         } else {
            throw new IllegalArgumentException("" + this.field3902 + ',' + var1 + ',' + var3);
         }
      }
   }

   boolean method5349(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.field3899) {
         try {
            int var7;
            boolean var10000;
            if (var4) {
               if (this.field3900.method5813() < (long)(6 + var1 * 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.field3900.method5795((long)(6 * var1));
               this.field3900.method5811(field3901, 0, 6);
               var7 = (field3901[5] & 255) + ((field3901[4] & 255) << 8) + ((field3901[3] & 255) << 16);
               if (var7 <= 0 || (long)var7 > this.field3899.method5813() / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var7 = (int)((this.field3899.method5813() + 519L) / 520L);
               if (var7 == 0) {
                  var7 = 1;
               }
            }

            field3901[0] = (byte)(var3 >> 16);
            field3901[1] = (byte)(var3 >> 8);
            field3901[2] = (byte)var3;
            field3901[3] = (byte)(var7 >> 16);
            field3901[4] = (byte)(var7 >> 8);
            field3901[5] = (byte)var7;
            this.field3900.method5795((long)(var1 * 6));
            this.field3900.method5801(field3901, 0, 6);
            int var8 = 0;
            int var9 = 0;

            while(true) {
               if (var8 < var3) {
                  label169: {
                     int var10 = 0;
                     int var11;
                     if (var4) {
                        this.field3899.method5795((long)var7 * 520L);
                        int var12;
                        int var13;
                        if (var1 > 65535) {
                           try {
                              this.field3899.method5811(field3901, 0, 10);
                           } catch (EOFException var17) {
                              break label169;
                           }

                           var11 = ((field3901[2] & 255) << 8) + ((field3901[1] & 255) << 16) + ((field3901[0] & 255) << 24) + (field3901[3] & 255);
                           var12 = ((field3901[4] & 255) << 8) + (field3901[5] & 255);
                           var10 = ((field3901[7] & 255) << 8) + ((field3901[6] & 255) << 16) + (field3901[8] & 255);
                           var13 = field3901[9] & 255;
                        } else {
                           try {
                              this.field3899.method5811(field3901, 0, 8);
                           } catch (EOFException var16) {
                              break label169;
                           }

                           var11 = (field3901[1] & 255) + ((field3901[0] & 255) << 8);
                           var12 = ((field3901[2] & 255) << 8) + (field3901[3] & 255);
                           var10 = (field3901[6] & 255) + ((field3901[5] & 255) << 8) + ((field3901[4] & 255) << 16);
                           var13 = field3901[7] & 255;
                        }

                        if (var1 != var11 || var9 != var12 || this.field3902 != var13) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var10 < 0 || (long)var10 > this.field3899.method5813() / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (var10 == 0) {
                        var4 = false;
                        var10 = (int)((this.field3899.method5813() + 519L) / 520L);
                        if (var10 == 0) {
                           ++var10;
                        }

                        if (var10 == var7) {
                           ++var10;
                        }
                     }

                     if (var1 > 65535) {
                        if (var3 - var8 <= 510) {
                           var10 = 0;
                        }

                        field3901[0] = (byte)(var1 >> 24);
                        field3901[1] = (byte)(var1 >> 16);
                        field3901[2] = (byte)(var1 >> 8);
                        field3901[3] = (byte)var1;
                        field3901[4] = (byte)(var9 >> 8);
                        field3901[5] = (byte)var9;
                        field3901[6] = (byte)(var10 >> 16);
                        field3901[7] = (byte)(var10 >> 8);
                        field3901[8] = (byte)var10;
                        field3901[9] = (byte)this.field3902;
                        this.field3899.method5795((long)var7 * 520L);
                        this.field3899.method5801(field3901, 0, 10);
                        var11 = var3 - var8;
                        if (var11 > 510) {
                           var11 = 510;
                        }

                        this.field3899.method5801(var2, var8, var11);
                        var8 += var11;
                     } else {
                        if (var3 - var8 <= 512) {
                           var10 = 0;
                        }

                        field3901[0] = (byte)(var1 >> 8);
                        field3901[1] = (byte)var1;
                        field3901[2] = (byte)(var9 >> 8);
                        field3901[3] = (byte)var9;
                        field3901[4] = (byte)(var10 >> 16);
                        field3901[5] = (byte)(var10 >> 8);
                        field3901[6] = (byte)var10;
                        field3901[7] = (byte)this.field3902;
                        this.field3899.method5795(520L * (long)var7);
                        this.field3899.method5801(field3901, 0, 8);
                        var11 = var3 - var8;
                        if (var11 > 512) {
                           var11 = 512;
                        }

                        this.field3899.method5801(var2, var8, var11);
                        var8 += var11;
                     }

                     var7 = var10;
                     ++var9;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var18) {
            return false;
         }
      }
   }

   public String toString() {
      return "" + this.field3902;
   }
}
