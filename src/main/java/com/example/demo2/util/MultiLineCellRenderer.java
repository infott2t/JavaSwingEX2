package com.example.demo2.util;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class MultiLineCellRenderer extends JTextArea implements TableCellRenderer {
    public MultiLineCellRenderer() {
        setLineWrap(true);
        setWrapStyleWord(true);
        setFocusable(false);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setText((String)value);
        setSize(table.getColumnModel().getColumn(column).getWidth(), getPreferredSize().height);
        if (table.getRowHeight(row) != getPreferredSize().height) {
            table.setRowHeight(row, getPreferredSize().height);
        }
        return this;
    }
}
