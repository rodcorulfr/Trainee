package Classes;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Telas_Professor.Laboratorio_P;

public class Laboratorio {

	private int id_lab;
	private int maquina;
	public Boolean validar = false;

	public

	BD bd = new BD();

	public ArrayList array = new ArrayList<String>();

	public Laboratorio() {
		this(0, 0);
	}

	public Laboratorio(int id_lab, int maquina) {
		this.setId_lab(id_lab);
		this.setMaquina(maquina);
	}

	public int getId_lab() {
		return id_lab;
	}

	public void setId_lab(int id_lab) {
		this.id_lab = id_lab;
	}

	public int getMaquina() {
		return maquina;
	}

	public void setMaquina(int maquina) {
		this.maquina = maquina;
	}

	public void tratar_dados() {
		bd.conectar();

		bd.trazer("laboratorios", "id_lab");
		array.clear();

		try {
			while (bd.result.next()) {
				array.add(bd.result.getString("id_lab"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public void excluirlab(String info) {

		bd.conectar();

		bd.apagar("laboratorios", "id_lab = " + info);

	}

}
