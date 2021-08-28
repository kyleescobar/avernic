public class class126 extends class104 {
   String field1447;
   long field1446;
   // $FF: synthetic field
   final class107 this$0;

   public static final int method2251(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (0.0D != var2) {
         double var12;
         if (var4 < 0.5D) {
            var12 = (var2 + 1.0D) * var4;
         } else {
            var12 = var2 + var4 - var2 * var4;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = var0 + 0.3333333333333333D;
         if (var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if (var20 < 0.0D) {
            ++var20;
         }

         if (var16 * 6.0D < 1.0D) {
            var6 = var14 + var16 * 6.0D * (var12 - var14);
         } else if (var16 * 2.0D < 1.0D) {
            var6 = var12;
         } else if (var16 * 3.0D < 2.0D) {
            var6 = var14 + (0.6666666666666666D - var16) * (var12 - var14) * 6.0D;
         } else {
            var6 = var14;
         }

         if (var0 * 6.0D < 1.0D) {
            var8 = 6.0D * (var12 - var14) * var0 + var14;
         } else if (var0 * 2.0D < 1.0D) {
            var8 = var12;
         } else if (3.0D * var0 < 2.0D) {
            var8 = 6.0D * (0.6666666666666666D - var0) * (var12 - var14) + var14;
         } else {
            var8 = var14;
         }

         if (6.0D * var20 < 1.0D) {
            var10 = var14 + var20 * 6.0D * (var12 - var14);
         } else if (2.0D * var20 < 1.0D) {
            var10 = var12;
         } else if (3.0D * var20 < 2.0D) {
            var10 = var14 + (var12 - var14) * (0.6666666666666666D - var20) * 6.0D;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(256.0D * var6);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(var10 * 256.0D);
      int var15 = (var13 << 8) + (var22 << 16) + var23;
      return var15;
   }

   public static int method2250(CharSequence var0, int var1) {
      return class44.method772(var0, var1, true);
   }

   static final void method2253(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8;
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         class62.field901[var1][var2][var3] = 0;

         while(true) {
            var8 = var0.readUnsignedByte();
            if (0 == var8) {
               if (var1 == 0) {
                  int[] var15 = class62.field911[0][var2];
                  int var12 = var4 + var2 + 932731;
                  int var13 = var5 + 556238 + var3;
                  int var14 = ServerPacket.method3921(var12 + '\ub135', var13 + 91923, 4) - 128 + (ServerPacket.method3921(var12 + 10294, '\u93bd' + var13, 2) - 128 >> 1) + (ServerPacket.method3921(var12, var13, 1) - 128 >> 2);
                  var14 = 35 + (int)((double)var14 * 0.3D);
                  if (var14 < 10) {
                     var14 = 10;
                  } else if (var14 > 60) {
                     var14 = 60;
                  }

                  var15[var3] = -var14 * 8;
               } else {
                  class62.field911[var1][var2][var3] = class62.field911[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (1 == var8) {
               int var9 = var0.readUnsignedByte();
               if (1 == var9) {
                  var9 = 0;
               }

               if (var1 == 0) {
                  class62.field911[0][var2][var3] = -var9 * 8;
               } else {
                  class62.field911[var1][var2][var3] = class62.field911[var1 - 1][var2][var3] - var9 * 8;
               }
               break;
            }

            if (var8 <= 49) {
               class61.field895[var1][var2][var3] = var0.readByte();
               class62.field916[var1][var2][var3] = (byte)((var8 - 2) / 4);
               class62.field910[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
            } else if (var8 <= 81) {
               class62.field901[var1][var2][var3] = (byte)(var8 - 49);
            } else {
               class340.field3937[var1][var2][var3] = (byte)(var8 - 81);
            }
         }
      } else {
         while(true) {
            var8 = var0.readUnsignedByte();
            if (var8 == 0) {
               break;
            }

            if (var8 == 1) {
               var0.readUnsignedByte();
               break;
            }

            if (var8 <= 49) {
               var0.readUnsignedByte();
            }
         }
      }

   }

   class126(class107 var1) {
      this.this$0 = var1;
      this.field1446 = -1L;
      this.field1447 = null;
   }

   void method2083(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1446 = var1.method5954();
      }

      this.field1447 = var1.method5956();
   }

   void method2084(class115 var1) {
      var1.method2127(this.field1446, this.field1447);
   }

   static int method2252(int var0, class59 var1, boolean var2) {
      if (5000 == var0) {
         class51.field747[++class51.field746 - 1] = client.field670;
         return 1;
      } else if (var0 == 5001) {
         class51.field746 -= 3;
         client.field670 = class51.field747[class51.field746];
         class125.field1441 = class158.method2772(class51.field747[class51.field746 + 1]);
         if (class125.field1441 == null) {
            class125.field1441 = class402.field4299;
         }

         client.field647 = class51.field747[2 + class51.field746];
         PacketBufferNode var14 = class149.getPacketBufferNode(ClientPacket.field2653, client.packetWriter.isaacCipher);
         var14.packetBuffer.writeByte(client.field670);
         var14.packetBuffer.writeByte(class125.field1441.field4301);
         var14.packetBuffer.writeByte(client.field647);
         client.packetWriter.addNode(var14);
         return 1;
      } else {
         String var4;
         PacketBufferNode var7;
         int var9;
         int var11;
         if (var0 == 5002) {
            var4 = class51.field738[--class2.field4];
            class51.field746 -= 2;
            var9 = class51.field747[class51.field746];
            var11 = class51.field747[class51.field746 + 1];
            var7 = class149.getPacketBufferNode(ClientPacket.field2601, client.packetWriter.isaacCipher);
            var7.packetBuffer.writeByte(class281.method4532(var4) + 2);
            var7.packetBuffer.writeStringCP1252(var4);
            var7.packetBuffer.writeByte(var9 - 1);
            var7.packetBuffer.writeByte(var11);
            client.packetWriter.addNode(var7);
            return 1;
         } else {
            class45 var6;
            int var8;
            if (var0 == 5003) {
               class51.field746 -= 2;
               var8 = class51.field747[class51.field746];
               var9 = class51.field747[1 + class51.field746];
               var6 = class2.method9(var8, var9);
               if (null != var6) {
                  class51.field747[++class51.field746 - 1] = var6.field378;
                  class51.field747[++class51.field746 - 1] = var6.field389;
                  class51.field738[++class2.field4 - 1] = var6.field380 != null ? var6.field380 : "";
                  class51.field738[++class2.field4 - 1] = var6.field385 != null ? var6.field385 : "";
                  class51.field738[++class2.field4 - 1] = var6.field388 != null ? var6.field388 : "";
                  class51.field747[++class51.field746 - 1] = var6.method797() ? 1 : (var6.method790() ? 2 : 0);
               } else {
                  class51.field747[++class51.field746 - 1] = -1;
                  class51.field747[++class51.field746 - 1] = 0;
                  class51.field738[++class2.field4 - 1] = "";
                  class51.field738[++class2.field4 - 1] = "";
                  class51.field738[++class2.field4 - 1] = "";
                  class51.field747[++class51.field746 - 1] = 0;
               }

               return 1;
            } else {
               class45 var5;
               if (5004 == var0) {
                  var8 = class51.field747[--class51.field746];
                  var5 = class130.method2277(var8);
                  if (var5 != null) {
                     class51.field747[++class51.field746 - 1] = var5.field379;
                     class51.field747[++class51.field746 - 1] = var5.field389;
                     class51.field738[++class2.field4 - 1] = null != var5.field380 ? var5.field380 : "";
                     class51.field738[++class2.field4 - 1] = var5.field385 != null ? var5.field385 : "";
                     class51.field738[++class2.field4 - 1] = null != var5.field388 ? var5.field388 : "";
                     class51.field747[++class51.field746 - 1] = var5.method797() ? 1 : (var5.method790() ? 2 : 0);
                  } else {
                     class51.field747[++class51.field746 - 1] = -1;
                     class51.field747[++class51.field746 - 1] = 0;
                     class51.field738[++class2.field4 - 1] = "";
                     class51.field738[++class2.field4 - 1] = "";
                     class51.field738[++class2.field4 - 1] = "";
                     class51.field747[++class51.field746 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 5005) {
                  if (null == class125.field1441) {
                     class51.field747[++class51.field746 - 1] = -1;
                  } else {
                     class51.field747[++class51.field746 - 1] = class125.field1441.field4301;
                  }

                  return 1;
               } else {
                  PacketBufferNode var12;
                  if (5008 == var0) {
                     var4 = class51.field738[--class2.field4];
                     var9 = class51.field747[--class51.field746];
                     var12 = class104.method2090(var9, var4, class284.field3644, -1);
                     client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == 5009) {
                     class2.field4 -= 2;
                     var4 = class51.field738[class2.field4];
                     String var10 = class51.field738[1 + class2.field4];
                     var12 = class149.getPacketBufferNode(ClientPacket.field2624, client.packetWriter.isaacCipher);
                     var12.packetBuffer.writeShort(0);
                     int var13 = var12.packetBuffer.offset;
                     var12.packetBuffer.writeStringCP1252(var4);
                     SpriteMask.method4149(var12.packetBuffer, var10);
                     var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var13);
                     client.packetWriter.addNode(var12);
                     return 1;
                  } else if (var0 == 5010) {
                     var4 = class51.field738[--class2.field4];
                     class51.field746 -= 2;
                     var9 = class51.field747[class51.field746];
                     var11 = class51.field747[1 + class51.field746];
                     var7 = class104.method2090(var9, var4, class284.field3644, var11);
                     client.packetWriter.addNode(var7);
                     return 1;
                  } else if (var0 != 5015) {
                     if (var0 == 5016) {
                        class51.field747[++class51.field746 - 1] = client.field647;
                        return 1;
                     } else if (var0 == 5017) {
                        var8 = class51.field747[--class51.field746];
                        class51.field747[++class51.field746 - 1] = class42.method757(var8);
                        return 1;
                     } else if (5018 == var0) {
                        var8 = class51.field747[--class51.field746];
                        class51.field747[++class51.field746 - 1] = class247.method4213(var8);
                        return 1;
                     } else if (var0 == 5019) {
                        var8 = class51.field747[--class51.field746];
                        class51.field747[++class51.field746 - 1] = SpriteMask.method4150(var8);
                        return 1;
                     } else if (5020 == var0) {
                        var4 = class51.field738[--class2.field4];
                        class122.method2213(var4);
                        return 1;
                     } else if (5021 == var0) {
                        client.field630 = class51.field738[--class2.field4].toLowerCase().trim();
                        return 1;
                     } else if (5022 == var0) {
                        class51.field738[++class2.field4 - 1] = client.field630;
                        return 1;
                     } else if (5023 == var0) {
                        var4 = class51.field738[--class2.field4];
                        System.out.println(var4);
                        return 1;
                     } else if (var0 == 5024) {
                        --class51.field746;
                        return 1;
                     } else if (5025 == var0) {
                        ++class51.field746;
                        return 1;
                     } else if (5030 == var0) {
                        class51.field746 -= 2;
                        var8 = class51.field747[class51.field746];
                        var9 = class51.field747[class51.field746 + 1];
                        var6 = class2.method9(var8, var9);
                        if (null != var6) {
                           class51.field747[++class51.field746 - 1] = var6.field378;
                           class51.field747[++class51.field746 - 1] = var6.field389;
                           class51.field738[++class2.field4 - 1] = null != var6.field380 ? var6.field380 : "";
                           class51.field738[++class2.field4 - 1] = null != var6.field385 ? var6.field385 : "";
                           class51.field738[++class2.field4 - 1] = null != var6.field388 ? var6.field388 : "";
                           class51.field747[++class51.field746 - 1] = var6.method797() ? 1 : (var6.method790() ? 2 : 0);
                           class51.field738[++class2.field4 - 1] = "";
                           class51.field747[++class51.field746 - 1] = 0;
                        } else {
                           class51.field747[++class51.field746 - 1] = -1;
                           class51.field747[++class51.field746 - 1] = 0;
                           class51.field738[++class2.field4 - 1] = "";
                           class51.field738[++class2.field4 - 1] = "";
                           class51.field738[++class2.field4 - 1] = "";
                           class51.field747[++class51.field746 - 1] = 0;
                           class51.field738[++class2.field4 - 1] = "";
                           class51.field747[++class51.field746 - 1] = 0;
                        }

                        return 1;
                     } else if (var0 == 5031) {
                        var8 = class51.field747[--class51.field746];
                        var5 = class130.method2277(var8);
                        if (var5 != null) {
                           class51.field747[++class51.field746 - 1] = var5.field379;
                           class51.field747[++class51.field746 - 1] = var5.field389;
                           class51.field738[++class2.field4 - 1] = var5.field380 != null ? var5.field380 : "";
                           class51.field738[++class2.field4 - 1] = null != var5.field385 ? var5.field385 : "";
                           class51.field738[++class2.field4 - 1] = var5.field388 != null ? var5.field388 : "";
                           class51.field747[++class51.field746 - 1] = var5.method797() ? 1 : (var5.method790() ? 2 : 0);
                           class51.field738[++class2.field4 - 1] = "";
                           class51.field747[++class51.field746 - 1] = 0;
                        } else {
                           class51.field747[++class51.field746 - 1] = -1;
                           class51.field747[++class51.field746 - 1] = 0;
                           class51.field738[++class2.field4 - 1] = "";
                           class51.field738[++class2.field4 - 1] = "";
                           class51.field738[++class2.field4 - 1] = "";
                           class51.field747[++class51.field746 - 1] = 0;
                           class51.field738[++class2.field4 - 1] = "";
                           class51.field747[++class51.field746 - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (MouseHandler.localPlayer != null && MouseHandler.localPlayer.username != null) {
                        var4 = MouseHandler.localPlayer.username.getName();
                     } else {
                        var4 = "";
                     }

                     class51.field738[++class2.field4 - 1] = var4;
                     return 1;
                  }
               }
            }
         }
      }
   }
}
