package com.emobilis.lizsqlitedatabase

class DBHelper((context: Context, factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {) {
}