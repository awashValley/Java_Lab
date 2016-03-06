/*     */ import java.io.PrintStream;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class TicTacToe
/*     */ {
/*   7 */   private final int BOARDSIZE = 3;
/*     */   private int[][] board;
/*     */   private boolean firstPlayer;
/*     */   private boolean gameOver;
/*     */ 
/*     */   public TicTacToe()
/*     */   {
/*  16 */     this.board = new int[3][3];
/*  17 */     this.firstPlayer = true;
/*  18 */     this.gameOver = false;
/*     */   }
/*     */ 
/*     */   public void play()
/*     */   {
/*  24 */     Scanner localScanner = new Scanner(System.in);
/*     */ 
/*  28 */     System.out.println("Player 1's turn.");
/*     */ 
/*  30 */     while (!this.gameOver) {
/*  32 */       int k = this.firstPlayer ? 1 : 2;
/*     */       int i;
/*     */       int j;
/*     */       do {
/*  37 */         System.out.printf("Player %d: Enter a row number (0, 1 or 2): ", new Object[] { Integer.valueOf(k) });
/*     */ 
/*  40 */         i = localScanner.nextInt();
/*  41 */         System.out.printf("Player %d: Enter a column number (0, 1 or 2): ", new Object[] { Integer.valueOf(k) });
/*     */ 
/*  44 */         j = localScanner.nextInt();
/*  45 */       }while (!validMove(i, j));
/*     */ 
/*  47 */       this.board[i][j] = k;
/*     */ 
/*  49 */       this.firstPlayer = (!this.firstPlayer);
/*     */ 
/*  51 */       printBoard();
/*  52 */       printStatus(k);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void printStatus(int paramInt)
/*     */   {
/*  59 */     TicTacToe.Status localStatus1 = gameStatus();
/*     */     TicTacToe.Status tmp6_5 = localStatus1; tmp6_5.getClass(); TicTacToe.Status localStatus2 = tmp6_5; if (localStatus2 != TicTacToe.Status.WIN) { if (localStatus2 != TicTacToe.Status.DRAW) { if (localStatus2 == TicTacToe.Status.CONTINUE) break label90; return; }
/*     */     } else
/*     */     {
/*  65 */       System.out.println("Player " + paramInt + " wins.");
/*  66 */       this.gameOver = true;
/*  67 */       return;
/*     */     }
/*     */ 
/*  70 */     System.out.println("Game is a draw.");
/*  71 */     this.gameOver = true;
/*  72 */     return;
/*     */ 
/*  75 */     label90: if (paramInt == 1)
/*  76 */       System.out.println("Player 2's turn.");
/*     */     else
/*  78 */       System.out.println("Player 1's turn.");
/*     */   }
/*     */ 
/*     */   public TicTacToe.Status gameStatus()
/*     */   {
/*  89 */     if ((this.board[0][0] != 0) && (this.board[0][0] == this.board[1][1]) && (this.board[0][0] == this.board[2][2]))
/*     */     {
/*  91 */       return TicTacToe.Status.WIN;
/*  92 */     }if ((this.board[2][0] != 0) && (this.board[2][0] == this.board[1][1]) && (this.board[2][0] == this.board[0][2]))
/*     */     {
/*  94 */       return TicTacToe.Status.WIN;
/*     */     }
/*     */ 
/*  97 */     for (int i = 0; i < 3; i++) {
/*  98 */       if ((this.board[i][0] != 0) && (this.board[i][0] == this.board[i][1]) && (this.board[i][0] == this.board[i][2]))
/*     */       {
/* 100 */         return TicTacToe.Status.WIN;
/*     */       }
/*     */     }
/* 103 */     for (i = 0; i < 3; i++) {
/* 104 */       if ((this.board[0][i] != 0) && (this.board[0][i] == this.board[1][i]) && (this.board[0][i] == this.board[2][i]))
/*     */       {
/* 106 */         return TicTacToe.Status.WIN;
/*     */       }
/*     */     }
/* 109 */     for (int j = 0; j < 3; j++) {
/* 110 */       for (int k = 0; k < 3; k++)
/* 111 */         if (this.board[j][k] == 0)
/* 112 */           return TicTacToe.Status.CONTINUE;
/*     */     }
/* 114 */     return TicTacToe.Status.DRAW;
/*     */   }
/*     */ 
/*     */   public void printBoard()
/*     */   {
/* 120 */     System.out.println(" _______________________ ");
/*     */ 
/* 122 */     for (int i = 0; i < 3; i++)
/*     */     {
/* 124 */       System.out.println("|       |       |       |");
/*     */ 
/* 126 */       for (int j = 0; j < 3; j++) {
/* 127 */         printSymbol(j, this.board[i][j]);
/*     */       }
/* 129 */       System.out.println("|_______|_______|_______|");
/*     */     }
/*     */   }
/*     */ 
/*     */   public void printSymbol(int paramInt1, int paramInt2)
/*     */   {
/* 136 */     switch (paramInt2)
/*     */     {
/*     */     case 0:
/* 139 */       System.out.print("|       ");
/* 140 */       break;
/*     */     case 1:
/* 143 */       System.out.print("|   1   ");
/* 144 */       break;
/*     */     case 2:
/* 147 */       System.out.print("|   2   ");
/*     */     }
/*     */ 
/* 151 */     if (paramInt1 == 2)
/* 152 */       System.out.println("|");
/*     */   }
/*     */ 
/*     */   public boolean validMove(int paramInt1, int paramInt2)
/*     */   {
/* 158 */     return (paramInt1 >= 0) && (paramInt1 < 3) && (paramInt2 >= 0) && (paramInt2 < 3) && (this.board[paramInt1][paramInt2] == 0);
/*     */   }
/*     */ 
/*     */   private static enum Status
/*     */   {
/*   8 */     WIN, DRAW, CONTINUE;
/*     */   }
/*     */ }

/* Location:           /Users/workuhm/Documents/Tic-Tac-Toe/
 * Qualified Name:     TicTacToe
 * JD-Core Version:    0.6.2
 */