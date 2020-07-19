package ar.com.globallogic.designpattern.adapter;

public class DomocileAdapterImpl implements DomocileAdapter {

	public DomicileService domiciles;
	public final String SEPARATOR = "|";

	public DomocileAdapterImpl(DomicileService domiciles) {
		this.domiciles = domiciles;
	}

	@Override
	public String adaptDomicile(int indx) {
		return toStringDomicile(this.domiciles.getList().get(indx));
	}

	private String toStringDomicile(Domicile domicile) {
		return domicile.getStreet() + SEPARATOR + domicile.getNumber() + SEPARATOR + domicile.getFloor() + SEPARATOR
				+ domicile.getFlat();
	}
}
