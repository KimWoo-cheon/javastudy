package model;

import java.util.ArrayList;
import java.util.Random;

public class EnemyDAO extends PMDAO {

	public ArrayList<PM> enemypoke() {
		ArrayList<PM> eplist = new ArrayList<PM>();
		Random random = new Random();
		int[] lotto = new int[5];

		for (int i = 0; i < 5; i++) {
			int number = random.nextInt(50) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == number) {
					number = random.nextInt(5) + 1;
					j = -1;
				}
			}
			lotto[i] = number;
		}

		try {
			getConn();
			for (int i = 0; i < 5; i++) {
				int num2 = lotto[i];
				String sql = "select*from(select rownum as num,name,type,atk,skill from poketmon) a where a.num=?";
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, num2);
				rs = psmt.executeQuery();
				if (rs.next()) {
					String name = rs.getString(2);
					String type = rs.getString(3);
					int atk = rs.getInt(4);
					String skill = rs.getString(5);

					PM ep = new PM(name, type, atk, skill);
					eplist.add(ep);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return eplist;
	}

	public PM Choice(String mypm) {
		PM ep = new PM("아", "아", 1, "아");

		try {
			getConn();
			String sq1 = "select * from poketmon where name=?";
			psmt = conn.prepareStatement(sq1);
			psmt.setString(1, mypm);
			rs = psmt.executeQuery();
			if (rs.next()) {
				ep.setName(rs.getString(1));
				ep.setType(rs.getString(2));
				ep.setSkill(rs.getString(4));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return ep;
	}
}
