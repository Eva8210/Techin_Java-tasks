package lt.techin.ec;

import lt.vtvpmc.java.postoffice.IllegalPackageException;
import lt.vtvpmc.java.postoffice.Package;
import lt.vtvpmc.java.postoffice.PostOffice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyPostOffice implements PostOffice {

    private List<Package> packages = new ArrayList<>();
    @Override
    public void postPackage(Package aPackage) throws IllegalPackageException {
        if (aPackage == null) throw new IllegalPackageException();
        if (aPackage.getPackageCode() == null || aPackage.getPackageCode().isEmpty()) throw new IllegalPackageException();
        if (aPackage.getOwner() == null || aPackage.getOwner().isEmpty()) throw new IllegalPackageException();
        else {
            packages.add(aPackage);
        }
    }

    @Override
    public long numberOfPackagesForOwner(String owner) {

        return packages.stream()
                .filter(own -> own.getOwner().equals(owner))
                .toList()
                .size();
    }

    @Override
    public Package retrievePackage(String packageCode) {

        for (Package retrieve: packages) {
            if(retrieve.getPackageCode().equals(packageCode)){
                packages.remove(retrieve);
                return retrieve;
            }
        }
        return null;
    }
}
